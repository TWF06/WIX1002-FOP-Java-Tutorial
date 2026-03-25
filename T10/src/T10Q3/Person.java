package T10Q3;

public class Person implements Comparable<Person>{
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void dispName(){
        System.out.println(name);
    }
    @Override
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}
