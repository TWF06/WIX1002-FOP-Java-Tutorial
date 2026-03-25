package Q4;

public class SugarPurchase extends PurchaseSystem{
    double sugarweight;
    public SugarPurchase(String prodCode, double prodprice,int quantity,double sugarweight){
        super( prodCode, prodprice,quantity);
        this.sugarweight=sugarweight;
    }
    
    @Override
    public double calcPrice(){
        totalprice= quantity*prodprice*sugarweight;
        return totalprice;
    }
}
