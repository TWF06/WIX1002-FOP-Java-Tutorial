package fop.t8q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose your payment method:");
        System.out.println("1.Cash");
        System.out.println("2.Cheque");
        System.out.println("3.Card");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Payment p = new Payment();
        switch(choice){
            case 1: {
                System.out.println("Payment Amount: RM ");
                double amt = sc.nextDouble();
                p.payment(amt);
                break;
            }
            case 2: {
                System.out.print("Paymnent Amount: RM ");
                double amt = sc.nextDouble();
                sc.nextLine();
                System.out.print("Cheque Number: ");
                String cheque = sc.nextLine();
                p.payment(amt, cheque);
                break;
            }
            case 3: {
                System.out.print("Payment Amount: RM ");
                double amt = sc.nextDouble();
                sc.nextLine();
                System.out.print("Card Holder Name: ");
                String cardH = sc.nextLine();
                System.out.print("Card Type: ");
                String cardTy = sc.nextLine();
                System.out.print("Card Exp Date: ");
                String cardED = sc.nextLine();
                System.out.print("Card Validation Code: ");
                String cardC = sc.nextLine();
                p.payment(amt, cardH, cardTy, cardED, cardC);
                break;
            }
        }
    }
}
