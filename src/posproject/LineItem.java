
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class LineItem {
    private Product product;
    private int qty;

    /*
     * Constructor
     */
    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    /*
     * Returns the line total
     */
    public double getOrigPriceSubtotal(){
        return qty * product.getPrice();
    }
    
    /*
     * Returns the amount saved per line
     */
    public double getAmountSavedSubtotal(){
        return getOrigPriceSubtotal() * product.getDiscountPercentage();
    }
    
}
