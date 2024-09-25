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
     * Getters and Setters for 4 given values
     * @return
     */
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}




