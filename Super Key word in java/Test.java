//use super with variables

class Vchicle
{
    int MaxSpeed = 120;

}
class Car extends Vchicle
{
    int MaxSpeed=180;
    void display()
    {
      System.out.println("Maximaum speed : " +super.MaxSpeed);
      System.out.println("Maximaum speed : " +MaxSpeed);
    }
}
class Test 
{
    public static void main(String [] args)
    {
        Car small = new Car();
        small.display();
    }
}