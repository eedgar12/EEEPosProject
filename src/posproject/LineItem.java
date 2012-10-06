/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class LineItem {
    private Product product;
    private int qty;

    public LineItem(Product product, int qty) {
//        System.out.println("Creating line item");
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
    
    public double getOrigPriceSubtotal(){
        return qty * product.getPrice();
    }
    public double getAmountSavedSubtotal(){
        return getOrigPriceSubtotal() * product.getDiscountPercentage();
    }
    
}
