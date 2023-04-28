/* waoojp to class person and student ( using single inheritance ).  */

class Person
{
private String name;
private int age;

public Person(String name, int age){
this.name=name;
this.age=age;
}
public void show(){
System.out.println("Name ="+name);
System.out.println("Age ="+age);
}
}
class Student extends Person
{
private int rno;
private int marks;

public Student(String name, int age, int rno, int marks){
super(name, age);
this.rno=rno;
this.marks=marks;
}
public void show(){
super.show();
System.out.println("Rno ="+rno);
System.out.println("Marks ="+marks);
}}
class p2
{
public static void main(String args[])
{
Student s=new Student("aman yadav",22,55,99);
s.show();
}
}