package fop.t8q2;

public class Main {

    public static void main(String[] args) {
        int a = 1345;
        Digit dgt = new Digit(a);
        int ans = dgt.digitMultitplication();
        dgt.displayOutput(ans);
        
        Digit abc = new Digit(4567);                //task f
        abc.displayOutput(abc.digitMultitplication());
        
        dgt.displayOutput(dgt.digitMultitplication());
    }
}
