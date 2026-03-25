package T10Q1;

public class OtherDiscount extends DiscountPolicy{
    
    @Override
    public double computeDiscount(int count ,double itemCost){
        double rate =0;
        if(count>=3 && count<=5){
            rate = 0.1;
        }
        else if(count<=8){
            rate = 0.2;
        }
        else if (count> 8){
            rate = 0.3;
        }
    return count*rate*itemCost;
    }
}
