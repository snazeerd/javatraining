package org.example;
 class Student {
    String name;
    float gpa;
    String course1;

    public Student(String name, float gpa, String course1) {
        name = name;
        gpa = gpa;
        course1 = course1;
    }
}
public class Main {
    public static void main(String[] args)
            Student[1] = new Student("abc",2.0,"english");
            Student[2] = new Student("xyz",3.0,"math");

    for (int i = 0; i < 3; i++) {
        System.out.println(students[i]);
    }
        System.out.println("Hello world!");
}