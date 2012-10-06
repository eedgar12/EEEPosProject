
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class NoDiscount implements DiscountStrategy{
    
    /*
     * Returns discount percentage
     */
    @Override
    public double getDiscountPercentage(){
        return 0.00;
    }
}
