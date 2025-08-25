import java.util.Scanner;
public class Userinput{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        
        System.out.print("Enter your age:");
        float age= sc.nextFloat();
        System.out.print("Enter your marks:");
        int marks= sc.nextInt();
        System.out.print("Enter your branch:");
        String branch = sc.nextLine();
        System.out.println("yourname:"+name+"your age:"+age+ "your branch:"+branch +"your marks:"+marks);
    }


}
