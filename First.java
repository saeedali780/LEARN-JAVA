// import java.util.Scanner;

class Student{
    String name;
    int age;
    String address;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
public class First{
    public static void main(String[]args){
    
     Student s1 = new Student();
     s1.name = "John";
     s1.age = 20;
     s1.address = "123 Main St";
     s1.display();
    };

};