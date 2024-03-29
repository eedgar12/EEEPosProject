
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The CashRegister class holds a receipt, an array of customers, and an array
 * of products.  When a transaction is started, this class finds the specified
 * customer and creates a new receipt object with that customer.  This class 
 * can add a Product to the receipt, and print the receipt.
 * 
 */
public class CashRegister {
    private Receipt receipt;
    
    Customer[] customers = {
        new Customer("001", "Valcq","Jon"),
        new Customer("002", "Edgar", "Emma"),
        new Customer("003", "Hamilton", "Dennis")
    };
        
    Product[] products = {
        new Product("001", "Hat", 19.95, new NoDiscount()),
        new Product("002", "Scarf", 14.99, new NoDiscount()),
        new Product("003", "Shoe", 39.98, new ChristmasDiscount()),
        new Product("004", "Jacket", 25.49, new ChristmasInJulyDiscount()),
        new Product("005", "Glove", 8.78, new PercentOffDiscount(.05))
    };

    /*
     * Add product to receipt
     */
    public final void addProduct(String productId, int qty){
        //needs validation
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
    
    /*
     * Start the transaction
     */
    public final void startTransaction(String customerId){
        //needs validation
        //search for customer
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getId())) {
                customer = c;
                break;
            }
        }
        
        // if found, add the lineItem to the receipt
        if(customer != null) {
            receipt = new Receipt(customer);
        }
    }
    
    /*
     * Print out the receipt
     */
    public final void printReceipt(){
        System.out.println(receipt.print());
    }
    
    
}
