class StudentE {
    int regno;
    String name;
    double marks;

    void insert(int i, String n, double d) {
        regno = i;
        name = n;
        marks = d;
    }

    void display() {
        System.out.println(regno + " " + name + " " + marks);
    }
}

public class StudentRe {
    public static void main(String[] args) {
        StudentE s1 = new StudentE();
        StudentE s2 = new StudentE();
        s1.insert(101, "Alice", 245.3);
        s1.display();
        s2.insert(102, "Bapi", 354.5);
        s2.display();
    }
}
