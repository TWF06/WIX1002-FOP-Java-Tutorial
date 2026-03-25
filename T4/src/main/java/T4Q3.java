
public class T4Q3 {
    public static void main(String[]args){
        int a=1,b=1,counter=1;
        System.out.println(a);
        System.out.println(b);
        while(counter<=4){
            a=a+b;
            System.out.println(a);
            b=b+a;
            System.out.println(b);
            counter++;
        }
            
    }
}
