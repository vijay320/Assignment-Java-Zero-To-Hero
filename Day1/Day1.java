//Write a program to which will store details of a student and print the details using the above class.

import java.util.Scanner;

class Student{
    int roll;
    String name;
    float marks;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll Number : ");
        roll = sc.nextInt();
        System.out.print("Enter Student Name : ");
        name = sc.next();
        System.out.print("Enter Student Roll Marks : ");
        marks = sc.nextFloat();
        sc.close();

    }
    void display(){
        System.out.println("Student Detail is => ");
        System.out.println("Roll Number : " +roll);
        System.out.println("Name : " +name);
        System.out.println("Marks : " +marks);

    }
}

class Day1 {
    public static void main(String[] args){
        Student s = new Student();
        s.input();
        s.display();

    }
    
}
