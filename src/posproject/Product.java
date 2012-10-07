
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The Product class holds information about a product: discount, description,
 * oringinal price, and product ID.  It also returns the percentage amount based
 * on the discount strategy.
 */
public class Product {
    private DiscountStrategy discountStrategy = new NoDiscount();
    private String description = "";
    private double price = 00.00;
    private String id = "";
   
    /*
     * Constructor
     */
    public Product(String id, String description, double price, DiscountStrategy discountStrategy) {
        //needs validation
        this.discountStrategy = discountStrategy;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        //needs validation
        this.discountStrategy = discountStrategy;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        //needs validation
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        //needs validation
        this.price = price;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        //needs validation
        this.id = id;
    }
    
    /*
     * Returns the discount percentage for the product
     */
    public final double getDiscountPercentage(){
        double discountPercentage = getDiscountStrategy().getDiscountPercentage();
        return discountPercentage;
    }
    
    
}
