package Q2;

public class Animal extends Organism {
    private double eatingNeed;
    
    public Animal(int size, double growthRate, double eatingNeed){
        super(size,growthRate);
        this.eatingNeed=eatingNeed;
    }
    
    public void dispOutput(){
        System.out.println("size: "+size);
        System.out.println("growth rate: "+growthRate);
        System.out.println("eating need: "+eatingNeed);
    }
}
