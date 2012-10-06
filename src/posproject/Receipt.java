
package posproject;
import java.text.DecimalFormat;
/*
 * Author: Emma Edgar
 * 
 */
public class Receipt {
    private Customer customer;
    private LineItem lineItems[] = new LineItem[0];
    private DecimalFormat formatter = new DecimalFormat("0.00");
            
    /*
     * Constructor
     */
    public Receipt(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    /*
     * Resizes array of LineItems and adds item to array
     */
    private void addToArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    /*
     * Sends new product to addToArray()
     */
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    
    /*
     * Returns receipt string
     */
    public String print(){
        String receipt = (
                (customer.getFirstName() + " " + customer.getLastName()) + "\n" +
                ("---------------------------") + "\n" +
                "Description, ID, Qty, Price, Subtotal" + "\n");
        
        for (LineItem li : lineItems){
            receipt += (li.getProduct().getDescription() + " " +
               li.getProduct().getId() + " " +
               li.getQty() + " " +
               li.getProduct().getPrice()  + " " +
               formatter.format(li.getOrigPriceSubtotal()) + "\n");
        }
        
        receipt += (("---------------------------") + "\n" +
                "Total before discount: " + formatter.format(getTotalBeforeDiscount()) + "\n" +
                "Total after discount: " + formatter.format(getTotalAfterDiscount()) + "\n" +
                "Amount saved: " + formatter.format(getDiscountAmount()));
        
        return receipt;
    }
    
    /*
     * Returns the receipt total without the discounts calculated
     */
    private double getTotalBeforeDiscount() {
        double grandTotal = 0.00;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
    /*
     * Returns the receipt total after the discount has been calculated
     */
    private double getTotalAfterDiscount(){
        return getTotalBeforeDiscount() - getDiscountAmount();
    }
    
    /*
     * Returns the total discount ammount
     */
    private double getDiscountAmount(){
        double totalDiscount = 0.0;
        for (LineItem item : lineItems){
            totalDiscount += item.getAmountSavedSubtotal();
        }
        return totalDiscount;
    }
}
