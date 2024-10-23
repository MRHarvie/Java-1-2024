package ca.nl.ca.mitchell.harvie.Assignment3;

/**
 * The Invoice class represents an invoice containing invoice items.
 */
public class Invoice {
    private InvoiceItem invoiceItem;

    /**
     * Default constructor for the Invoice class.
     * This constructor creates an instance of Invoice without any initial data.
     */
    public Invoice() {
        // Default constructor
    }

    /**
     * Returns the invoice item associated with this invoice.
     *
     * @return The invoice item.
     */
    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * Sets the invoice item for this invoice.
     *
     * @param invoiceItem The invoice item to set.
     */
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    /**
     * Calculates and returns the total for the invoice.
     *
     * @return The total price for the invoice.
     */
    public double getInvoiceTotal() {
        return invoiceItem != null ? invoiceItem.getItemTotal() : 0.0;
    }

    /**
     * Prints the invoice details, including individual items and total.
     */
    public void printInvoice() {
        if (invoiceItem != null) {
            Product product = invoiceItem.getProduct();
            System.out.printf("\nInvoice Details:%n"); //Line Break Separation
            System.out.printf("Item: %s%n", product.getName());
            System.out.printf("Quantity: %d%n", invoiceItem.getQuantity());
            System.out.printf("Price: $%.2f%n", product.getPrice());
            System.out.printf("Total for this item: $%.2f%n", invoiceItem.getItemTotal());
            System.out.printf("Invoice Total: $%.2f%n", getInvoiceTotal());
        } else {
            System.out.println("No items in the invoice.");
        }
    }

}
