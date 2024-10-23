package ca.nl.ca.mitchell.harvie.Assignment3;

/**
 * The InvoiceItem class represents an item on an invoice,
 * which consists of a product and a quantity.
 * This class provides methods to manage the product details and
 * calculate the total price for the invoice item.
 */
public class InvoiceItem {
    private Product product;
    private int quantity;

    /**
     * Constructs an InvoiceItem with the specified product and quantity.
     *
     * @param product  The product associated with this invoice item.
     * @param quantity The quantity of the product. Must be non-negative.
     */
    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Returns the product associated with this invoice item.
     *
     * @return The product.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product for this invoice item.
     *
     * @param product The product to set.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Returns the quantity of the product.
     *
     * @return The quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity The quantity to set. Must be non-negative.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the total price for this invoice item,
     * which is the product price multiplied by the quantity.
     *
     * @return The total price for this item.
     */
    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}
