class StudentD {
    // By referance variable out side class

    int regno;
    String name;
    double marks;
}
public class TestDetail{
    public static void main(String[] args){
        StudentD  s1 = new StudentD();
        s1.regno = 101;
        s1.name = "Alice";
        s1.marks = 95.5;
        System.out.println("Reg No: " + s1.regno + ", Name: " + s1.name + ", Marks: " + s1.marks);
    }

}
