package t6;
public class T6Q2 {
    public static void descendingOrder(int a, int b, int c){
        int []arranged = new int[3];
        arranged [0] = Math.max(Math.max(a, b), c);
        arranged [2] = Math.min(Math.min(a, b), c);
        if (a!=arranged[0]&&a!=arranged[2])
            arranged [1] = a;
        else if (b!=arranged[0]&&b!=arranged[2])
            arranged [1] = b;
        else
            arranged [1] = c;
        
        for (int A : arranged)
            System.out.println(A);
    }
    
    public static void main (String[]args){
        descendingOrder(498,6,50);
    }
}
