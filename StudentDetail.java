class StudentDetail {
    // BY REFERENCE VARIABLES
    int regno;
    String name;
    int marks;

    public static void main(String[] args) {
        StudentDetail sd = new StudentDetail();
        StudentDetail s = new StudentDetail();

        sd.regno = 101;
        sd.name = "Alice";
        sd.marks = 95;
        System.out.println("Reg No: " + sd.regno + ", Name: " + sd.name + ", Marks: " + sd.marks);

        s.regno = 102;
        s.name = "Bapi";
        s.marks = 35456;
        System.out.println("Reg No: " + s.regno + ", Name: " + s.name + ", Marks: " + s.marks);
    }
}