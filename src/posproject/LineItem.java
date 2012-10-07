
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The LineItem class holds a product and a quantity for each line.  It also
 * returns the total price of the line without the discount, and it returns the
 * amount saved for the line based on the product's discount strategy.
 */
public class LineItem {
    private Product product;
    private int qty;

    /*
     * Constructor
     */
    public LineItem(Product product, int qty) {
        //needs validation
        this.product = product;
        this.qty = qty;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        //needs validation
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //needs validation
        this.qty = qty;
    }
    
    /*
     * Returns the line total
     */
    public final double getOrigPriceSubtotal(){
        return qty * product.getPrice();
    }
    
    /*
     * Returns the amount saved per line
     */
    public final double getAmountSavedSubtotal(){
        return getOrigPriceSubtotal() * product.getDiscountPercentage();
    }
    
}
