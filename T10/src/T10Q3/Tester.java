package T10Q3;

import java.util.Arrays;

public class Tester {
    public static void main(String[]args){
        Person[]people = {new Person("Ali"), new Person("Zara"),new Person("Ahmad"), new Person("John")};
        
        Arrays.sort(people);
        System.out.println("Sorted:");
        for (Person p: people){
            p.dispName();
        }
    }
}
