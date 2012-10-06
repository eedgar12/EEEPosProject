/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;
import java.text.DecimalFormat;
/**
 *
 * @author eedgar
 */
public class Receipt {
    private Customer customer;
    private LineItem lineItems[] = new LineItem[0];
    private DecimalFormat formatter = new DecimalFormat("0.00");
            
    
    public Receipt(Customer customer) {
//        System.out.println("Creating new receipt with customer: " + customer.getFirstName() +
//                " " + customer.getLastName());
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
    
    private void addToArray(LineItem item){
//        System.out.println("adding new line item");
   
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    
    
    public String print(){
        String receipt = ((customer.getFirstName() + " " + customer.getLastName()) + "\n" +
                ("---------------------------") + "\n");
        
        for (LineItem li : lineItems){
            receipt += (li.getProduct().getDescription() + " " +
               li.getProduct().getId() + " " +
               li.getProduct().getPrice()  + " " +
               formatter.format(li.getProduct().getPrice() * 
                    li.getProduct().getDiscountStrategy().getDiscountPercentage()
                    ) + "\n");
           
        }
        receipt += (("---------------------------") + "\n" +
                "Total before discount: " + formatter.format(getTotalBeforeDiscount()) + "\n" +
                "Total after discount: " + formatter.format(getTotalAfterDiscount()) + "\n" +
                "Amount saved: " + formatter.format(getDiscountAmount()));
        
        
        return receipt;
    }
    
    private double getTotalBeforeDiscount() {
        double grandTotal = 0.00;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        
        return grandTotal;
    }
    
    private double getTotalAfterDiscount(){
        return getTotalBeforeDiscount() - getDiscountAmount();
    }
    
    private double getDiscountAmount(){
        double totalDiscount = 0.0;
        for (LineItem item : lineItems){
            totalDiscount += item.getAmountSavedSubtotal();
        }
        return totalDiscount;
    }
}
