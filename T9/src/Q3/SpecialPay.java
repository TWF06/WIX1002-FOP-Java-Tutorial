package Q3;

public class SpecialPay extends PaySystem {
    public SpecialPay(double payPerH, int numH){
        super(payPerH,numH);
    }
    
    @Override
    public double calcPay(){
        return ((payPerH*numH)*1.3);
    }
    
    
}
