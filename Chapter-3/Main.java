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


        String ip;
        //ip = scanner.nextLine();
        ip = "Hello";

        // String Builder in Java

        /*
            In Java, StringBuilder is a mutable class that allows you to modify and manipulate strings
            without creating new objects, which is especially useful in DSA problems where efficiency is key.

            $$ Mutability: Unlike regular String in Java, StringBuilder allows changes to the sequence of characters directly.

            $$ Efficiency: When you perform many string manipulations (appending, inserting, or deleting),
                StringBuilder is faster than concatenating String objects because it doesn’t create multiple temporary strings.
        */

        StringBuilder sb = new StringBuilder(ip);

        // Appending in to the input string
        sb.append("World");
        System.out.println("Resultant (append) : " + sb.toString());

        // Inserting in to the input string
        sb.insert(5,','); // Hello,World
        sb.insert(6,' '); // Hello, World
        sb.insert(12,'!'); // Hello, World!
        sb.insert(12,'!'); // Hello, World!!

        System.out.println("Resultant (insert) : " + sb.toString());

        // Deleting an element form the input
        // s --> start index (inclusive)
        // e --> end index (exclusive)
        sb.delete(12,13);
        System.out.println("Resultant (delete) : " + sb.toString());

        // Replacing a part from the input
        sb.replace(7, sb.length() - 1, "Java");
        System.out.println("Resultant (replace) : " + sb.toString());

        // Reversal of a string
        sb.reverse();
        System.out.println("Final Result : " + sb.toString());

        ip = sb.toString();

        scanner.close();
    }
}
