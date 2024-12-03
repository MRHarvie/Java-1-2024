package ca.nl.ca.mitchell.harvie.Project;


/**
 * Billable items database with hardcoded products provided by Josh
 * Also has a method for finding a billable item by ID
 */
public class BillableItemsDatabase {

    private final Product[] products;
    private final Service[] services;

    public BillableItemsDatabase() {
        this.products = new Product[] {
                new Product(101, "Windshield Wiper Blades", 25.99),
                new Product(102, "Engine Oil (5W-30, 1 Quart)", 9.99),
                new Product(103, "Air Filter", 15.50),
                new Product(104, "Brake Pads (Set of 2)", 55.00),
                new Product(105, "Tire (All-Season, Single)", 110.00),
                new Product(106, "Car Battery (Standard 12V)", 95.00),
                new Product(107, "Headlight Bulb (LED, Single)", 22.99),
                new Product(108, "Radiator Coolant (1 Gallon)", 19.99),
                new Product(109, "Spark Plug (Single)", 7.50),
                new Product(110, "Windshield Washer Fluid (1 Gallon)", 4.99)
        };
        this.services = new Service[] {
                new Service(201, "Oil Change", 40.00, 1),
                new Service(202, "Tire Rotation", 35.00, 1),
                new Service(203, "Brake Inspection and Replacement", 60.00, 1),
                new Service(204, "Engine Diagnostic", 80.00, 1),
                new Service(205, "Full Vehicle Detailing", 120.00, 1)
        };
    }

    /**
     * Returns an array of all hardcoded products.
     *
     * @return An array of Product objects.
     */
    public Product[] getAllProducts() {
        return products;
    }

    /**
     * Returns an array of all hardcoded services.
     *
     * @return An array of Service objects.
     */
    public Service[] getAllServices() {
        return services;
    }

    /**
     * Finds a Billable item by its ID.
     *
     * @param id    The ID of the item to find.
     * @return      The Billable item if found, or null if not found.
     */
    public Billable findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        for (Service service : services) {
            if (service.getId() == id) {
                return service;
            }
        }
        return null;
    }
}
