package Q1;
   
public class Main {
    public static boolean compare(Student s, Teacher t){
        return (Class<?>) s.getClass() == (Class<?>)t.getClass();
    }
    
    public static boolean compareSubclass(Student s){
        return (s instanceof Person);
    }
    
    
    public static void main(String[]args){
        Student s = new Student();
        Teacher t = new Teacher();
        System.out.println("Same class: "+ compare(s,t));
        
        System.out.println("Subclass of Person: "+ compareSubclass(s));
    }
}
