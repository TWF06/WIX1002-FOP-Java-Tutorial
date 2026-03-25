
public class T5Q5 {
    public static void main(String[]args){
        String []sentence = {"ABC","abc","XYZ","xyz"};
        String temp;
    
        for (int i=(sentence.length-1);i>=0;i--){
            temp = sentence[i];
            for (int j=(temp.length()-1);j>=0;j--){
                System.out.print(temp.charAt(j));
            }
            System.out.println("");
        }
    }
}
