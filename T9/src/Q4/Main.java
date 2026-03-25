package Q4;

public class Main {
    public static void main (String []args){
        PurchaseSystem ps= new PurchaseSystem("ABC",12.5,10);
        ps.disp();
        
        SugarPurchase sp = new SugarPurchase("DEF",12.5,10,10);
        sp.disp();
    }
}
