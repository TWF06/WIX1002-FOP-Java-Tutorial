
public class T5Q1 {
    public static void main(String[]args){
        //a
        double []pointNum = new double[12];
        
        //b
        char []alphabet = {'A','B','C','D','E'};
        
        //C
        String []name = new String[100];
        
        //d
        int [][]integers = new int[6][2];
        
        //e
        int [][]num = {{6,9},{2,5},{4,6}};
        
        //System.out.print(num[2][1]);//test
        
        //f
        num[1][1]=4;
        num[2][0]=3;
        num[2][1]=7;
        
        //Displaying num multi dimensional array
        for(int i =0 ; i<num.length; i++){
            for(int j=0; j<num[i].length;j++){
            System.out.print(num[i][j] + "\t");
            }
            System.out.println("");
        }
        
        //g
        String contact[] = {"Ali","Abu","Ahmad","Ati"};
        for(String ctt : contact)
            System.out.println(ctt);
        
        //extra in class
        String occ13[] = new String[14];
        
    }   
}
