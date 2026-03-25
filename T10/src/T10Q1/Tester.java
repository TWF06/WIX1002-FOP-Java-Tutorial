package T10Q1;

public class Tester {
    public static void main(String[]args){
        DiscountPolicy bulk = new BulkDiscount(5,0.15);
        DiscountPolicy other =  new OtherDiscount();
        DiscountPolicy combine = new combineDiscount(bulk, other);
        
        int count =10;
        double price = 20;
        System.out.println("Bulk: "+ bulk.computeDiscount(count, price));
        System.out.println("Other: "+ other.computeDiscount(count, price));
        System.out.println("combine: "+ combine.computeDiscount(count, price));
    }
}
