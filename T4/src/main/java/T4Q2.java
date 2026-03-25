
public class T4Q2 {
    public static void main(String[]args){
        //a
        int sum =0;
        for (int x=10; x>0; x--)
            sum +=x;
        System.out.println(sum);
        
        //b
        int x=0, y=0;
        do{
            x+=2;
            y +=x;
            System.out.println(x+"and"+y);
        }while(x<100);
        
        //c
        for (int xc=1,yc=20; xc<yc; xc++, yc-=2)
            System.out.println(xc+""+yc);
        
        //d
        int i=1;
        while(i<=10){
            if(i==10)
                System.out.println("Program End");
        i++;  
        }
    }
}
