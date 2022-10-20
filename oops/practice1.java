// package oops;
/* given a class student with variables name and marks
 * create another class with main method and assign the name and marks
 */
public class practice1 {
    public static void main(String[] args) {
        Student s = new Bacche();
        s.print();
        Student s2 = new Student();
        s2.print();
        // s.name = "nikhil";
        // s.marks = 100;
        // System.out.println(s.name);
        // System.out.println(s.marks);
    }
}

class Student{
    String name;
    int marks;
    void print(){
        System.out.println("base class");
    }
}

class Bacche extends Student{
    void print1(){
        System.out.println("derived class");
    }
}
