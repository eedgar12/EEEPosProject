/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class POSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CashRegister cr = new CashRegister();
        cr.startTransaction("002");
        cr.addProduct("003", 2);
        cr.addProduct("001", 3);
        cr.printReceipt();
        
    }
}
