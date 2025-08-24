class Student {
    // by method
    String name;
    int age;
    int reg;
    void displayInfo(){
System.out.println("Name:" + name);
System.out.println("age:" + age);
System.out.println("reg:"+ reg);
    }
}
public class Main{
    public static void main(String[] args){
        Student st = new Student();
        st.name = "John";
        st.age = 20;    
        st.reg = 12345;
        st.displayInfo();
    }
}
    