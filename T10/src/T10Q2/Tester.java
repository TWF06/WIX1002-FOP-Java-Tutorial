package T10Q2;

public class Tester {
    public static void main(String[]args){
        Interest saving = new SavingAccount(10000);
        FixedAccount fixed =  new FixedAccount();
        fixed.setBalance(10000);
        
        System.out.printf("Saving:%.2f\n",saving.computeInterest());
        System.out.printf("Fixed:%.2f\n", fixed.computeInterest());
    }
}
