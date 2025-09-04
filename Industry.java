// java program to demonstrate parameterized constracture
class Industry{
    int id;
    String name;
    Industry(int i ,String n){
        id = i;
        name = n;

    }
    //method to display the values 
    void display(){
        System.out.println(id +" "+name);

    }
    public static void main(String args []){
        //creating object and passing values
        Industry s1 = new Industry(111,"ABC");
        Industry s2 = new Industry(222,"mno");
        //calling method to display the values of object
        s1.display();
        s2.display();


    }
}