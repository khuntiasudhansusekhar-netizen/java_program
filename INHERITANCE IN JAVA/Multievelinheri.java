class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps: xip xip");
    }
}

public class Multievelinheri {
    public static void main(String[] args) {
        Puppy p = new Puppy();  // ✅ Create Puppy object
        p.eat();    // From Animal
        p.sound();  // From Dog
        p.weep();   // From Puppy
    }
}
