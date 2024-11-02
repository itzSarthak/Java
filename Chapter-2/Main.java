import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        // Basic User Input in Java
        // Scanner class is used to take user inputs of various data types.
        Scanner scanner = new Scanner(System.in);

        // Taking an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Taking a floating-point input
        System.out.print("Enter a float: ");
        float decimalNumber = scanner.nextFloat();
        System.out.println("You entered: " + decimalNumber);

        // Taking a character input
        System.out.print("Enter a character: ");
        char singleChar = scanner.next().charAt(0);
        System.out.println("You entered: " + singleChar);

        // Taking a string input
        System.out.print("Enter a string: ");
        scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);



        // Introduction to Array
        // Arrays are used to store multiple values of the same type in a single variable.

        // Fixed-size array example
        int[] fixedArray = {1, 2, 3, 4, 5};
        System.out.print("Fixed-size array: ");
        for (int num : fixedArray)
            System.out.print(num + " ");

        System.out.println();


        // Multidimensional (2D) Array with User Input for Rows and Columns
        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int columns = scanner.nextInt();

        // Initialize a 2D array with the specified rows and columns
        int[][] twoDArray = new int[rows][columns];

        // Taking input for the 2D array
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Displaying the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
                System.out.print(twoDArray[i][j] + " ");

            System.out.println();
        }

        // Jagged Array with Dynamic Row Sizes (each row can have a different number of columns)
        System.out.print("Enter the number of rows for the jagged array: ");
        int jaggedRows = scanner.nextInt();

        // Initialize a jagged array with the specified rows
        int[][] jaggedArray = new int[jaggedRows][];

        // Taking input for each row's size and elements in the jagged array
        for (int i = 0; i < jaggedRows; i++)
        {
            System.out.print("Enter the number of columns for row " + i + ": ");
            int jaggedColumns = scanner.nextInt();
            jaggedArray[i] = new int[jaggedColumns];

            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < jaggedColumns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedRows; i++)
        {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
