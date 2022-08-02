package com.Varun;

public class ClassTut {
    public static void main(String[] args) {
     Student[] students = new Student[5];
     Student varun = new Student(16,"Varun", 87.7f);
     Student arpit = new Student(19,"arpit",89.5f);
     Student roy = new Student();
//        System.out.println(varun.name);
//        System.out.println(varun.roll);
//        System.out.println(varun.marks);
//        System.out.println(arpit.name);
//        System.out.println(arpit.roll);
//        System.out.println(arpit.marks);
//        System.out.println(roy.name);
//        System.out.println(roy.roll);
//        System.out.println(roy.marks);
//        Student random = new Student(varun);
//        System.out.println(random.marks);
        Student one = new Student();
        Student two = one;
//        one.name = "Something something";
        System.out.println(two.name);
    }
     static class Student{
         int roll;
         String name;
         float marks;

     Student (Student other){
         this.name=other.name;
         this.roll=other.roll;
         this.marks=other.marks;
     }
 Student (){

 }

     Student(int roll  ,String name ,  float marks){
         this.roll=roll;
         this.name=name;
         this.marks=marks;
     }


     }
}
