/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class CashRegister {
    private Receipt receipt;
    
    Customer[] customers = {
        new Customer("001", "Valcq","Jon"),
        new Customer("002", "Edgar", "Emma"),
        new Customer("003", "Edgar", "Dennis")
    };
        
    Product[] products = {
        new Product("001", "Hat", 19.95, new NoDiscount()),
        new Product("002", "Scarf", 14.99, new NoDiscount()),
        new Product("003", "Shoes", 39.98, new ChristmasDiscount())
    };

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    public void addProduct(String productId, int qty){
//        System.out.println("Adding product");
        Product product = null;
        for(Product p : products) {
            if(productId.equals(p.getId())) {
                product = p;
                break;
            }
        }
        
        // if found, add the lineItem to the receipt
        if(product != null) {
            receipt.addLineItem(product, qty);
        }
    }
    
//    public void addProduct(String productId, int qty, DiscountStrategy discountStrategy){
//        System.out.println("Adding product");
//        Product product = null;
//        for(Product p : products) {
//            if(productId.equals(p.getId())) {
//                product = p;
//                break;
//            }
//        }
//        
//        // if found, add the lineItem to the receipt
//        if(product != null) {
//            receipt.addLineItem(product, qty);
//        }
//    }
    
    public void startTransaction(String customerId){
//        System.out.println("Starting transaction");
        //search for customer
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getId())) {
                customer = c;
                
                break;
                
            }
        }
        
        
//        System.out.println("Setting customer to receipt");
        	// if found, add the lineItem to the receipt
        if(customer != null) {
            
            receipt = new Receipt(customer);
        }
        
    }
    
    public void printReceipt(){
//        System.out.println("Printing receipt");
        System.out.println(receipt.print());
        
        
        
        
        
    }
    
    
}
