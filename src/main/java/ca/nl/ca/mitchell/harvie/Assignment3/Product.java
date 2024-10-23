package ca.nl.ca.mitchell.harvie.Assignment3;

/**
 * The Product class represents a product with a unique id, a description, and a price.
 * This class allows for the creation and manipulation of product details.
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Constructs a Product with the specified id, description, and price.
     *
     * @param id          The unique identifier for the product. Cannot be negative.
     * @param description A brief description of the product.
     * @param price       The price of the product. Must be non-negative.
     */
    public Product(int id, String description, double price) {

        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     * Returns the product ID.
     *
     * @return The product ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the product ID.
     *
     * @param id The product ID to set. Must be non-negative.
     */
    public void setId(int id) {
        if (id < 0) {
            this.id = id;
        }
    }

    /**
     * Returns the product description.
     *
     * @return The product description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description.
     *
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the product price.
     *
     * @return The product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the product price.
     *
     * @param price The price to set. Must be non-negative.
     */
    public void setPrice(double price) {

        this.price = price;
    }

    /**
     * Returns the product name.
     *
     * @return The product name.
     */
    public String getName() {
        return description;
    }


}
