class Person {
    // Constructor of Person class
    Person() {
        System.out.println("This is Person class constructor:");
    }
}

class Derived extends Person {
    // Constructor of Derived class
    Derived() {
        System.out.println("Derived class constructor called:");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();  // Object creation
    }
}
