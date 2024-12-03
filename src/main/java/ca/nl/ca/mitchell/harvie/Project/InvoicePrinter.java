package ca.nl.ca.mitchell.harvie.Project;

import java.time.format.DateTimeFormatter;

/**
 * Invoice printer class for printing invoices in a formatted way that could be printed and used
 * in a real business environment.
 * This invoice has all the information from the other classes and prints out a nice and neat invoice
 */
public class InvoicePrinter {

    /**
     * Prints the invoice in a neat format, including customer details,
     * item list of invoice items, subtotal, sales tax, and grand total.
     *
     * @param invoice The invoice that is being printed.
     */
    public void printInvoice(Invoice invoice) {
        // Date formatter for when the invoice is created
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = invoice.getDate().format(formatter);

        // Header
        System.out.println("-".repeat(95));
        System.out.printf("%55s%n", "AUTO BODY SHOP");
        System.out.printf("%55s%n", "INVOICE #12345");
        System.out.println("-".repeat(95));

        // Customer details
        System.out.println("Customer name: " + invoice.getCustomer().getName());
        System.out.println("Customer email: " + invoice.getCustomer().getEmail());
        System.out.println("Customer address: " + invoice.getCustomer().getAddress());
        System.out.println();

        // Invoice details
        System.out.println("Date: " + invoice.getDate().format(formatter));
        System.out.println("Payment terms: " + invoice.getPaymentTerms());
        System.out.println("Notes: " + invoice.getNotes());
        System.out.println();

        // Header for the item list
        System.out.println("-".repeat(95));
        System.out.printf("| %-2s | %-40s | %-6s | %-10s | %-21s |%n", "#", "Description", "Qty", "Unit Price", "Total");
        System.out.println("-".repeat(95));

        // Printing each item in the invoice
        for (int i = 0; i < invoice.getInvoiceItems().length; i++) {
            InvoiceItem item = invoice.getInvoiceItems()[i];
            if (item != null) {
                String quantity = item.getBillable() instanceof Service
                        ? item.getQuantity() + "hr" // For services
                        : String.valueOf(item.getQuantity()); // For products

                // Adjusting the print for full descriptions
                System.out.printf("| %-2d | %-40s | %-6s | $%-9.2f | $%-20.2f |%n",
                        i + 1,
                        item.getBillable().getDescription(), // Full description
                        quantity,
                        item.getBillable().getPrice(),
                        item.getItemTotal());
            }
        }

        // Footer of the invoice
        System.out.println("-".repeat(95));
        System.out.printf("| %67s | $%-20.2f |%n", "Subtotal:", invoice.getInvoiceTotal());
        System.out.printf("| %67s | $%-20.2f |%n", "Sales Tax (13%):", invoice.getInvoiceTotalWithTax() - invoice.getInvoiceTotal());
        System.out.printf("| %67s | $%-20.2f |%n", "TOTAL:", invoice.getInvoiceTotalWithTax());
        System.out.println("-".repeat(95));
        System.out.println();

        // Footer message
        System.out.println("** Notes: All sales are final unless otherwise stated. \n" +
                "Please contact us at (555) 555-5555 for any inquiries. **");
    }
}
