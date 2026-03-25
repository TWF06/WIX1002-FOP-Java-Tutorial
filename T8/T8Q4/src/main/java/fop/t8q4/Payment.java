package fop.t8q4;

public class Payment {
    public void payment(double amount){//cash
        System.out.println("Total of RM "+amount+" cash received. Thank you.");
    }
    public void payment(double amount, String chequeNum){//cheque
        System.out.println("Total of RM "+amount+" received in cheque with the cheque number "+chequeNum+". Thank you.");
    }
    public void payment(double amount, String cardHolder, String cardType, String expDate, String code){//card
        System.out.println("Total of RM "+amount+" received from "+cardHolder+" via card payment. Thank you.");
    }
}
