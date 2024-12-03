package ca.nl.ca.mitchell.harvie.Project;

/**
 * Represents an item on an invoice, which can be either a product or a service.
 * Each InvoiceItem contains a reference to a billable item and its associated quantity.
 */
public class InvoiceItem {

    private Billable billable;
    private int quantity;

    /**
     * Constructs an InvoiceItem with the specified billable item and quantity.
     *
     * @param billable The billable item (either a Product or a Service) to be associated with this InvoiceItem.
     *                 The billable item determines the base price and other details for this item.
     * @param quantity The number of units for the billable item. For services, this represents the number of hours.
     */
    public InvoiceItem(Billable billable, int quantity) {
        this.billable = billable;
        this.quantity = quantity;
    }

    /**
     * Get the billable associated with the invoice
     * @return Billable The billable item
     */
    public Billable getBillable() {
        return billable;
    }

    /**
     * Set the billable item associated with the invoice
     * @param billable The billable item to set
     */
    public void setBillable(Billable billable) {
        this.billable = billable;
    }

    /**
     * Get the quantity of the billable item
     * @return The quantity of the billable item
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity of the billable item
     * @param quantity The quantity that needs ot be set
     */
    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    /**
     * Calculates the total cost of this invoice item based on the quantity
     * and the price of the associated billable item.
     *
     * @return The total cost for this invoice item.
     */
    public double getItemTotal() {
        // Total = price for the service
        return billable.getPrice() * quantity; // Total = price per unit * quantity
    }
}