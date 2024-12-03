package ca.nl.ca.mitchell.harvie.Project;


/**
 * Product class that is a child to the billable class, uses the billable attributes, returns a product as a
 * billable item
 */
public class Product extends Billable{

    /**
     * Billable constructor for the following params
     *
     * @param id          ID of the billable object
     * @param description Description of billable object
     * @param price       Price of billable object
     */
    public Product(int id, String description, double price) {
        super(id, description, price);
    }

    /**
     * Get the billing details using the parent class
     * @return Returns a string with the details of a Product
     */
    public String getBillingDetails() {
        return "Product: " + getDescription() + ", Price: $" + getPrice();
    }
}