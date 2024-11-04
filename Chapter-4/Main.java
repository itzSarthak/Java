import java.util.Scanner;
public class Main
{
    class Mobile
    {
        // Instance Properties (Belong to the objects)
        String BrandName;
        double price;

        // Static Properties (Belong to the whole class)
        static String Name;


        // A static Block to initialise static Values **
        // Every time while loading of clas this block gets called **
        static
        {
            Name = "Smart Phone";
        }

        // Below method is indirectly accessing non-static properties **
        static void show (Mobile obj)
        {
            System.out.println("I am a static Class .");
            System.out.println("I can only access static members");

            System.out.println(Name);
            System.out.println(obj.BrandName + " " + obj.price);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
