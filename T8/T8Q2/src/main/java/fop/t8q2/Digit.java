package fop.t8q2;

public class Digit {                                //task a
    private int number;                             //task b
    public Digit(int a){                            //task c
        number = a;
    }
    int digitMultitplication(){                //task d
        String temp = Integer.toString(number);
        int product=1;
        for(int i= 0; i<temp.length(); i++){
            int valueC = Character.getNumericValue(temp.charAt(i));
            //System.out.print(valueC);
            product*=valueC;
        }
        return product;
    }
    void displayOutput(int a){                  //task e
        System.out.println("digitMultiplication: "+a);
    }
}
