package ca.nl.ca.mitchell.harvie.Project;

import java.time.LocalDate;

/**
 * Invoice class to represent an invoice containing data
 * Contains methods to add / remove Invoice items
 * Method to get the invoice total with and without tax
 */
public class Invoice {

    private Customer customer;
    private InvoiceItem[] invoiceItems;
    private int itemCount;
    private LocalDate date;
    private String paymentTerms;
    private String notes;
    private double salesTaxRate;

    /**
     * Invoice constructor with multiple params
     *
     * @param customer      The customer from the customer class
     * @param invoiceitems  Invoice items from invoice class
     * @param itemCount     Count of the items for invoice
     * @param date          Date the invoice was created
     * @param paymentTerms  Payment terms for the invoice
     * @param notes         Notes that might be on the invoice
     * @param salesTaxRate  The sales tax rate that is applied
     */
    public Invoice(Customer customer, InvoiceItem[] invoiceitems, int itemCount, LocalDate date, String paymentTerms, String notes, double salesTaxRate) {
        this.customer = customer;
        this.invoiceItems = invoiceitems;
        this.itemCount = itemCount;
        this.date = date;
        this.paymentTerms = paymentTerms;
        this.notes = notes;
        this.salesTaxRate = salesTaxRate;
    }

    /**
     * Method to add an invoice item to the invoice
     *
     * @param item  Takes the item as a param
     * @return      Returns true or false if an invoice item was added
     */
    public boolean addInvoiceItem(InvoiceItem item) {
        if (itemCount < invoiceItems.length) {
            invoiceItems[itemCount++] = item; // Add the item and increment the count
            return true;
        } else {
            return false;
        }
    }

    /**
     * Remove an item from the invoice
     *
     * @param index     Takes the index as a param
     * @return          Returns true or false if an invoice item was deleted or not
     */
    public boolean removeInvoiceItem(int index) {
        if (index >= 0 && index < itemCount) {
            for (int i = index; i < itemCount - 1; i++) {
                invoiceItems[i] = invoiceItems[i + 1]; // Shift items to the left
            }
            invoiceItems[--itemCount] = null; // Nullify the last item and decrease the count
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the invoice subtotal (before tax)
     * @return Subtotal before tax
     */
    public double getInvoiceTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += invoiceItems[i].getItemTotal(); // Sum up item totals
        }
        return total;
    }

    /**
     * Get the invoice total with tax
     * @return Subtotal after tax
     */
    public double getInvoiceTotalWithTax() {
        double subtotal = getInvoiceTotal();
        return subtotal + (subtotal * salesTaxRate);
    }

    /**
     * Get the customer
     * @return Customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Set the customer
     * @param customer Customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Get the invoice items
     * @return The array of invoice items
     */
    public InvoiceItem[] getInvoiceitems() {
        return invoiceItems;
    }

    /**
     * Set the invoice items
     * @param invoiceitems One param of the array of invoice items
     */
    public void setInvoiceitems(InvoiceItem[] invoiceitems) {
        this.invoiceItems = invoiceitems;
    }

    /**
     * Get the item count of the invoice
     * @return Item count
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Set the item count of the invoice
     * @param itemCount Item count
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Get the date of the invoice
     * @return Returns the date the invoice was created
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Set the date on the invoice
     * @param date Date param
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Get the payment terms from the invoice
     * @return Payment terms
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Set the payment terms
     * @param paymentTerms Payment terms
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * Get the notes from the invoice
     * @return Returns the invoice notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Set the invoice notes
     * @param notes Takes in the param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Get the sales tax rate from the invoice
     * @return Sales tax rate
     */
    public double getSalesTaxRate() {
        return salesTaxRate;
    }

    /**
     * Set the sales tax rate on the invoice
     * @param salesTaxRate One param of sales tax
     */
    public void setSalesTaxRate(double salesTaxRate) {
        this.salesTaxRate = salesTaxRate;
    }

    public InvoiceItem[] getInvoiceItems() {
        return invoiceItems;
    }
}