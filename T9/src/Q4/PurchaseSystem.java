package Q4;

public class PurchaseSystem {
    String prodCode;
    double prodprice,totalprice;
    int quantity;
    
    public PurchaseSystem(String prodCode, double prodprice,int quantity){
        this.prodCode=prodCode;
        this.prodprice=prodprice;
        this.quantity=quantity;
    }
    
    public double calcPrice(){
        totalprice= quantity*prodprice;
        return totalprice;
    }
    
    public void disp(){
        System.out.println("product code: "+prodCode);
        System.out.println("unit price: "+prodprice);
        System.out.println("quantity: "+quantity);
        System.out.println("total price: "+calcPrice());
    }
}
