class Box 
{
    double width , height ,depth;
    //constructor used when all dimesions specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    //constuctor used when no dimensions specified 
    Box()
    {
        width = height = depth  = 0;
    }
    //consturctor used when cube is created 
    Box(double len)
    {
        width = height = depth = len;
        
    }
    // conpute and return volume 
    double volume()
    {
        return width*height*depth;

    }
}
public class Overloadcon2
{
    public static void main ( String args [])
    {
        // create boxes using the various constucors 
        Box  mybox1 = new Box(10, 20,15);
        Box mybox2 = new Box();
        Box mycuble = new Box(7);
        double vol;
        // get volume of first box 
        vol = mybox1.volume();
        System.out.println("volume of box1 is " +vol);
        // ger second volume of second box
        vol = mybox2.volume();
        System.out.println("volume of mybox2 is "+vol);
        vol = mycuble.volume();
        System.out.println("volume of mycuble is " +vol);


    }
}