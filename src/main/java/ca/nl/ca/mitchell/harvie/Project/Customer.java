package ca.nl.ca.mitchell.harvie.Project;

/**
 * Customer class to represent a customer in an invoice system
 */
public class Customer {

    private String name;
    private String email;
    private String address;

    /**
     * Customer constructor.
     * They have a name, email and address
     *
     * @param name      Name of the customer
     * @param email     Email for the customer
     * @param address   Address for the customer
     */
    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * Get the name of the customer
     * @return Returns the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the customer
     * @param name Name of the customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the email of the customer
     * @return Returns the email of the customer
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email for the customer
     * @param email Takes email as a param
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the address from the customer
     * @return The address from the customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address for the customer
     * @param address Takes the address as a param
     */
    public void setAddress(String address) {
        this.address = address;
    }
}