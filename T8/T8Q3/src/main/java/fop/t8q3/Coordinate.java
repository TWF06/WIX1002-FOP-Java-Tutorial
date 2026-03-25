package fop.t8q3;

public class Coordinate {
    private int [][]Coor;
    
    public Coordinate (int a,int b){
        Coor = new int[b][a];
    }
    
    int getYMax(){
        return Coor.length;
    }
    
    int getXMax(){
        return Coor[Coor.length-1].length;
    }
    
    void setCoordinatePlot(int a, int b){
        Coor[b][a]=1;
    }
    
    void changeCoordinateMax(int a ,int b){
        Coor = new int[b][a];
    }
    
    void displayPlot(){
        for (int i =Coor.length-1; i>=0; i--){
            for(int j=0;j<Coor[i].length; j++){
                if (Coor[i][j]==0){
                    System.out.print("0");
                }
                else
                    System.out.print("1");
            }
            System.out.println("");
        }
    }
    
    void displayCoordinateLocation(){
        for (int i =0; i<Coor.length; i++){
            for(int j=0;j<Coor[i].length; j++){
                if (Coor[i][j]==1){
                    System.out.println("X="+j+",Y="+i);
                }
            }
        }
    }
}
