class Person
{
    Person()
    {
        System.out.println("person class Constructor");

    }
}
class Student extends Person
{
Student()
{
    super();
    System.out.println("Student class Constructor:");
}
}
class Constructors
{
    public static void main(String [] args)
    {
        Student s = new Student();
    }
}