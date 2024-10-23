package ca.nl.ca.mitchell.harvie.Assignment2;

/**
 * Initiate Employee class with values:
 * First Name
 * Last Name
 * Annual Salary
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double annualSalary;

    /**
     * Constructor That initializes each instances variable
     * If annual salary given is < 0, set annual salary to 0
     */
    public Employee(String firstName, String lastName, double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (annualSalary > 0) {
            this.annualSalary = annualSalary;
        } else {
            this.annualSalary = 0;
        }
    }


    /**
     * Getter for first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter for first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Getter for last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for Last Name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for annual salary
     * @return annual salary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }
    /**
     * Setter for annual salary
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    /**
     * Method that applies a raise by modifying the annual salary by the percent.
     * Multiplies the given annualSalary by percent to determine raise value
     * Adds Raise value to annual salary
     */
    public void giveRaise(double percent) {
        if (percent > 0) {
            this.annualSalary += this.annualSalary * (percent/100);
        }
    }
}
