//commented line is to loop check leap year from 2000 to 2100
public class T3Q5 {
    public static void main(String[]args){
        int year = 2000;
        //while(year<=2100){
        //System.out.println(year);
        if (year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not leap year");
        }
        //year++;
        //}
    }
}
