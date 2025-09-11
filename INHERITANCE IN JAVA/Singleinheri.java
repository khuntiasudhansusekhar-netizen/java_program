class Animal
{
    void sound(){
        System.out.println("Amimals makde sounds");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog bark woof");

    }
} 
public class Singleinheri
{
    public static void main(String args [])
    {
        Dog mydog = new Dog();
        mydog.sound();
        mydog.bark();
    }
}