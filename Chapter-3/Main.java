import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input;
        input = scanner.next();


        // Lower & Upper Transform **
        String lower = input.toLowerCase();
        String upper = input.toUpperCase();

        System.out.println("Lower : " + lower + "\nUpper : " + upper);

        // Length of string **
        System.out.println("Total no of Elements in input : " + input.length());


        // Accessing Elements at Specified Positions **
        System.out.println("Elements at 2nd locations is : " + input.charAt(2));


        // Substring Formations **
        System.out.println("Substring Formations : " + input.substring(2,4));


        // Getting Index of a Particular Elements **
        System.out.println("Index of 'u' is : " + input.indexOf('u'));


        // Weather an element present **
        // This method check for a part of string present in parent **
        System.out.println("Weather 'u' present " + input.contains("u"));


        // Comparing two strings **
        System.out.println("Comparing 'lower' & 'upper' : " + lower.equals(upper));
        System.out.println("Comparing 'lower' & 'upper' : " + lower.equalsIgnoreCase(upper));


        // Replacing one char to others **
        String ip = "Jake";
        ip = input.replace('J','C');
        System.out.println(ip);

        scanner.close();
    }
}
