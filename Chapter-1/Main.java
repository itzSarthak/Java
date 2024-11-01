public class Main
{
    public static void main(String[] args) {

        // Execution of Java
        System.out.println("\n\nThis is the main method.\nEntry Point for the Java Program.");

        // Primitive or Value Types **

        // Primitive Data Types
        byte byteValue = 10;        // 1 byte
        short shortValue = 100;     // 2 bytes
        int intValue = 1000;        // 4 bytes
        long longValue = 10000L;    // 8 bytes
        float floatValue = 10.5f;   // 4 bytes
        double doubleValue = 20.5;  // 8 bytes
        char charValue = 'A';       // 2 bytes
        boolean boolValue = true;   // 1 bit

        System.out.println("Primitive Types: byte, short, int, long, float, double, char, boolean");


        // Type Conversion (Explicit and Implicit)
        System.out.println("\nType Conversion:");

        // Implicit conversion (small to larger type)
        int intFromByte = byteValue;
        double doubleFromInt = intValue;

        System.out.println("Implicit Conversion (byte to int): " + intFromByte);
        System.out.println("Implicit Conversion (int to double): " + doubleFromInt);

        // Explicit conversion (larger to smaller type, needs casting)
        int intFromDouble = (int) doubleValue;
        System.out.println("Explicit Conversion (double to int): " + intFromDouble);

        // Type Promotion in Expressions
        System.out.println("\nType Promotion:");

        // In expressions, smaller types are promoted to int by default
        byte byte1 = 40;
        byte byte2 = 50;
        int promotedResult = byte1 * byte2;
        System.out.println("Result of byte addition promoted to int: " + promotedResult);

        // Operators
        System.out.println("\nOperators:");

        // Arithmetic Operators
        int addition = intValue + 10;
        int subtraction = intValue - 5;
        int multiplication = intValue * 2;
        double division = doubleValue / 2;
        int modulus = intValue % 3;

        System.out.println("Arithmetic Operators: +, -, *, /, %");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Relational Operators
        System.out.println("Relational Operators: ==, !=, >, <, >=, <=");
        System.out.println("intValue == 1000: " + (intValue == 1000));
        System.out.println("intValue != 1000: " + (intValue != 1000));
        System.out.println("intValue > 500: " + (intValue > 500));

        // Logical Operators
        System.out.println("Logical Operators: &&, ||, !");
        System.out.println("true && false: " + (true && false));
        System.out.println("true || false: " + (true || false));
        System.out.println("!true: " + (!true));

        // Control Flow
        System.out.println("\nControl Flow:");

        int number = 5;
        // if-else
        if (number > 0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");


        // switch
        switch (number)
        {
            case 1:
                System.out.println("Number is one");
                break;
            case 5:
                System.out.println("Number is five");
                break;
            default:
                System.out.println("Number is unknown");
        }

        // 5. Loops
        System.out.println("\nLoops:");

        // for loop
        System.out.println("For loop (1 to 5):");
        for (int i = 1; i <= 5; i++)
            System.out.print(i + " ");

        // while loop
        System.out.println("\nWhile loop (1 to 5):");
        int i = 1;
        while (i <= 5)
        {
            System.out.print(i + " ");
            i++;
        }

        // do-while loop
        System.out.println("\nDo-While loop (1 to 5):");
        i = 1;
        do
        {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);

        System.out.println("\nEnd of Java Tutorials Overview.");
    }
}
