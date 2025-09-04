class Overloadcon1 {
    int id ;
    String name;
    int age;
    //Creating two arg constractor
    Overloadcon1(int i , String n)
    {
        id = i;
        name = n;

    }
    //creating three arg constractor
    Overloadcon1( int i, String n , int a )
    {
        id = i;
        name = n;
        age = a ;

    }
    void display(){
        System.out. println(id+" "+name+" "+age);
    }
    public static void main (String args [])
    {
        Overloadcon1 o1 = new Overloadcon1(13345," sudhansu");
        Overloadcon1 o2 = new Overloadcon1( 3556, "somu", 67);
        o1.display();
        o2.display();

    }
}