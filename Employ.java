//write a java program static key word , name , id , company tcs with static variable 
class Employ{
    static String company = "TCS";
    int id ;
    String name ;
    Employ(int i , String n)
    {
        id = i;
        name = n;

    }
    void display(){
        System.out.println(name+" "+id+" "+ company);

    
}
public static void main (String args []){
    Employ E1 = new Employ(20235,"sudhansu");
    E1.display();

}
}