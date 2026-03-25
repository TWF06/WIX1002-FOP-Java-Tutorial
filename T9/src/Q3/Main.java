package Q3;
public class Main {
   public static void main(String[]args){
       RegularPay rp =new RegularPay(11.1,5);
       SpecialPay sp =new SpecialPay(11.1,5);
       System.out.println("Regular");
       rp.disp();
       System.out.println("Special");
       sp.disp();
   } 
}
