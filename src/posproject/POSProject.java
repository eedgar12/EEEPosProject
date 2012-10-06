package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class POSProject {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startTransaction("001");
        cr.addProduct("003", 2);
        cr.addProduct("001", 3);
        cr.addProduct("005", 1);
        cr.printReceipt();
    }
}
