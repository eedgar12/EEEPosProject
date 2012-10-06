/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class Product {
    private DiscountStrategy discountStrategy = new NoDiscount();
    private String description = "";
    private double price = 00.00;
    private String id = "";
   

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
    
    public double getDiscountPercentage(){
        double discountPercentage = getDiscountStrategy().getDiscountPercentage();
        
        return discountPercentage;
    }
    
    
    
    
}
