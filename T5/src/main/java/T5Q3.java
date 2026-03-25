
public class T5Q3 {
    public static void main(String[]args){
        int[]marks = new int[5];
        int i=0,j=1;
        marks[i]=12;
        marks[j]=marks[i]+19;//marks[1]=12+19
        marks[j-1]=marks[j]*marks[j];//marks[0]=31*31       
        marks[j*3]=marks[i+1];//marks[3]=marks[1]=31
        marks[++j]=marks[i]%5;//marks[2]=31%5
        marks[2*j]=marks[j-1];//marks[4]=marks[1]=31
        
        
        //to check answer
        for(int check:marks)
            System.out.println(check);
    }
    //marks[0]=961
    //marks[1]=31
    //marks[2]=1
    //marks[3]=31
    //marks[4]=31
}
