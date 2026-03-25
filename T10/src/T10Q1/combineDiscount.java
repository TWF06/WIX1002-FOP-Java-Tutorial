package T10Q1;

public class combineDiscount extends DiscountPolicy {
    private DiscountPolicy d1;
    private DiscountPolicy d2;
    
    public combineDiscount(DiscountPolicy p1, DiscountPolicy p2){
        this.d1=p1;
        this.d2=p2;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost){
        return Math.max(d1.computeDiscount(count, itemCost), d2.computeDiscount(count, itemCost));
    }
}
