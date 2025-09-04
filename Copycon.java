class Copycon
{
    int id ;
    String name;
    //constructor to initilixe integer and string
    Copycon(int i , String n)
    {
        id =i;
        name = n;

    }
    //constructor to initilize another object 
    Copycon(Copycon c)
    {
        id = c.id;
        name = c.name;

    }
    void display(){
        System.out.println(id+" "+name);

    }
    public static void main(String args []){
    Copycon c1 = new Copycon(1111,"ABC");
    Copycon c2 = new Copycon(c1);
    c1.display();
    c2.display();
    }
}