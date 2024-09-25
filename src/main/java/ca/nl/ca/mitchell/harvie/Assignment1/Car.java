package ca.nl.ca.mitchell.harvie.Assignment1;

/**
 * Creating car class with values make, model, year, value
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double value;

    /**
     * Constructor that takes all 4 values
     * @param make
     * @param model
     * @param year
     * @param value
     */
    public Car(String make, String model, int year, double value) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    /**
     * Getter for make.
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter for make.
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for model.
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter for model
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for year.
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter for value.
     * @return
     */
    public double getValue() {
        return value;
    }

    /**
     * Setter for value.
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }
}




