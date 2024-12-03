package ca.nl.ca.mitchell.harvie.Project;


import java.time.LocalDate;

/**
 * Main Class to create the invoice and grab items from the hardcoded Billable Items Database
 */
public class Main {
    /**
     * Invoice class to demo an invoice.
     */
    public static void main(String[] args) {
        BillableItemsDatabase database = new BillableItemsDatabase();

        //  Retrieve products and services from the database
        Product product1 = (Product) database.findById(101); // Windshield Wiper Blades
        Product product2 = (Product) database.findById(102); // Engine Oil
        Product product3 = (Product) database.findById(103); // Air Filter
        Product product4 = (Product) database.findById(104); // Brake Pads
        Service service1 = (Service) database.findById(202); // Tire Rotation
        Service service2 = (Service) database.findById(205); // Full Vehicle Detailing

        // Customer
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Main Street, Springfield");

        // Items
        InvoiceItem[] invoiceItems = new InvoiceItem[10]; // Assuming a maximum of 10 items
        invoiceItems[0] = new InvoiceItem(product1, 2); // 2 Windshield Wiper Blades
        invoiceItems[1] = new InvoiceItem(product2, 4); // 4 Engine Oil
        invoiceItems[2] = new InvoiceItem(product3, 1); // 1 Air Filter
        invoiceItems[3] = new InvoiceItem(product4, 1); // 1 Brake Pads
        invoiceItems[4] = new InvoiceItem(service1, 1); // 1-hour Tire Rotation
        invoiceItems[5] = new InvoiceItem(service2, 1); // 1-hour Full Vehicle Detailing

        // Invoice details
        LocalDate date = LocalDate.now();
        String paymentTerms = "Net 30";
        String notes = "Thank you for your business!";
        double salesTaxRate = 0.13;
        int itemCount = 6; // Number of items added to the invoice

        // Creating invoice
        Invoice invoice = new Invoice(customer, invoiceItems, itemCount, date, paymentTerms, notes, salesTaxRate);

        // Print the invoice
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(invoice);
    }
}

