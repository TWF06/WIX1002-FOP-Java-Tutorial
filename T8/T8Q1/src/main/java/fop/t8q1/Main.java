package fop.t8q1;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student();                    //task g
        stu.displayContactNum();
        String a = "011-11930345";
        stu.setContactNum(a);                           //task h
        stu.displayContactNum();
        
        Animal animal = new Animal();                   //task i
        animal.setAnimal("Animal");
        System.out.println("Animal is "+ animal.getAnimal());
        
        Animal cat = new Animal();                      //task j
        cat.setAnimal("Cat");
        System.out.println("Animal is "+ cat.getAnimal());
        
        Number num = new Number(20);                    //task k
        Number num1 = new Number(40);
        
    }
}
