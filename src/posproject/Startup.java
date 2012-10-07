package posproject;
/*
 * Author: Emma Edgar
 * 
 * This program represents a cash register at a clothing store.  It starts a 
 * transaction by inputting the customer ID.  Then it adds items, and prints a 
 * receipt with the transaction totals.
 */
public class Startup {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startTransaction("002");
        cr.addProduct("003", 2);
        cr.addProduct("001", 3);
        cr.addProduct("005", 1);
        cr.printReceipt();
    }
}
