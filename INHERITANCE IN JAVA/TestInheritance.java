class Employe{
    int salary =5500;
    
}
class SoftwareDevelopment extends Employe
{
    float bonous = 55669;
}
class TestInheritance
{
    public static void main(String args[]){
        SoftwareDevelopment sd =  new SoftwareDevelopment();
        System.out.println("salary is " +sd.salary);
        System.out.println("Bonous is "+sd.bonous);
    }
}