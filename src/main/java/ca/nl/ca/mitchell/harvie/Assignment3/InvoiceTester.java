package ca.nl.ca.mitchell.harvie.Assignment3;

/**
 * The InvoiceTester class is used to test the functionality of the
 * Product, InvoiceItem, and Invoice classes. It demonstrates how to
 * create products, invoice items, and invoices, while also testing
 * error handling for invalid inputs.
 */
public class InvoiceTester {

    /**
     * Default constructor for the InvoiceTester class.
     * This constructor creates an instance of InvoiceTester without any initial data.
     */
    public InvoiceTester() {
        // Default constructor
    }

    /**
     * The main method to run tests for the Product, InvoiceItem, and Invoice classes.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 1000.00);
        Product product2 = new Product(2, "Mouse", 25.00);
        Product product3 = new Product(3, "Keyboard", 50.00);

        // Test negative price and quantity cases (edge cases)
        try {
            Product invalidProduct = new Product(-1, "Invalid", -100.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid product: " + e.getMessage());
        }

        // Create InvoiceItems
        InvoiceItem item1 = new InvoiceItem(product1, 2);
        InvoiceItem item2 = new InvoiceItem(product2, 5);

        // Test negative quantity
        try {
            InvoiceItem invalidItem = new InvoiceItem(product1, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for invalid quantity: " + e.getMessage());
        }

        // Create an invoice and set an item
        Invoice invoice = new Invoice();
        invoice.setInvoiceItem(item1);

        // Print invoice details for the first item
        invoice.printInvoice();

        // Test with another item (replace the previous one)
        invoice.setInvoiceItem(item2); // Second item
        // Print invoice details for the second item
        invoice.printInvoice();
    }
}
