package ca.nl.ca.mitchell.harvie.Project;

/**
 * Service class that is a child to the Billable class, uses the billable attributes,
 * represents a billable service item, charges per hour, and updates the Billable class.
 */
public class Service extends Billable {

    private int hours;
    private double ratePerHour;

    /**
     * Constructor for the Service class.
     *
     * @param id          ID of the billable object
     * @param description Description of the billable object
     * @param ratePerHour Rate charged per hour for the service
     * @param hours       Number of hours the service is provided
     */
    public Service(int id, String description, double ratePerHour, int hours) {
        super(id, description, ratePerHour * hours); // Calculate price as ratePerHour * hours
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    /**
     * Get the number of hours for the service.
     *
     * @return Number of hours.
     */
    public int getHours() {
        return hours;
    }

    /**
     * Set the number of hours for the service and update the price.
     *
     * @param hours Number of hours.
     */
    public void setHours(int hours) {
        this.hours = hours;
        setPrice(ratePerHour * hours); // Update the price based on the new hours
    }

    /**
     * Get the rate per hour for the service.
     *
     * @return Rate per hour.
     */
    public double getRatePerHour() {
        return ratePerHour;
    }

    /**
     * Set the rate per hour for the service and update the price.
     *
     * @param ratePerHour Rate per hour.
     */
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
        setPrice(ratePerHour * hours); // Update the price based on the new rate per hour
    }

    /**
     * Get the billing details of the service.
     *
     * @return String representation of the service's billing details.
     */
    public String getBillingDetails() {
        return "Service: " + getDescription() + ", Hours: " + hours +
                ", Rate/Hour: $" + ratePerHour + ", Total: $" + getPrice();
    }
}