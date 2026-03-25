
public class T5Q4 {
    public static void main(String[]args){
        String []sentence = {"the","abc","aaa","xyz"};
        String target = "the";
        
        for (int i=0; i<sentence.length; i++){
            if (sentence[i].equals(target)){
                int index = i;
                int loc = i+1;
                System.out.println("The word 'the' is located at index "+ index +".");
                System.out.println("It is the position "+ loc +" word in array.");
            }
        }
    }
}
