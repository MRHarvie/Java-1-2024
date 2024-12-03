package ca.nl.ca.mitchell.harvie.Project;/**

 /**
 * Billable class to act as a blueprint for the product and service class
 * for making these things billable with extra attributes.
 */
public class Billable {

    private int id;
    private String description;
    private double price;

    /**
     * Billable constructor for the following params
     *
     * @param id          ID of the billable object
     * @param description Description of billable object
     * @param price       Price of billable object
     */
    public Billable(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     * Returns the ID of a billable object
     * @return ID from product or service
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of a billable object
     * @param id ID of the product or service
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the description of a billable object
     * @return Description from product or service
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of a billable object
     * @param description Description of the product or service
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the price of a billable object
     * @return Return the price of a product or service
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of a billable object
     * @param price Price of the product or service
     */
    public void setPrice(double price) {
        this.price = price;
    }
}