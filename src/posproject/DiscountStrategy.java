
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The DiscountStrategy interface is implemented by all discount strategies.  
 * Every Product item has a discount strategy.  Each discount strategy returns 
 * a discount percentage.
 */
public interface DiscountStrategy {
    /*
     * Returns discount percentage
     */
    public abstract double getDiscountPercentage();
}
