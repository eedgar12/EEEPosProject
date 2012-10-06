
package posproject;
/*
 * Author: Emma Edgar
 * 
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
        this.discountStrategy = discountStrategy;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /*
     * Returns the discount percentage for the product
     */
    public double getDiscountPercentage(){
        double discountPercentage = getDiscountStrategy().getDiscountPercentage();
        return discountPercentage;
    }
    
    
}
