package Q3;

public class PaySystem {
    protected double payPerH;
    protected int numH;
    
    public PaySystem(double payPerH, int numH){
        this.numH=numH;
        this.payPerH=payPerH;
    }
    
    public double calcPay(){
        return (payPerH*numH);
    }
    
    public void disp(){
        System.out.println("pay per hour is "+payPerH);
        System.out.println("working hour is "+numH);
        System.out.println("total pay is "+ calcPay());
    }
}
