
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The NoDiscount class implements the DiscountStrategy interface.  It
 * returns a value of 0.00.
 */
public class NoDiscount implements DiscountStrategy{
    
    /*
     * Returns discount percentage
     */
    @Override
    public final double getDiscountPercentage(){
        return 0.00;
    }
}
