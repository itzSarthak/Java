import java.util.Scanner;
public class Main
{
    public static int[] FirstNFibonacci(int n)
    {
        int[] result = new int[n];

        result[0] = 0;
        if(n == 1)
            return  result;

        result[1] = 1;
        if(n == 2)
            return  result;


        for(int i = 2; i < n; i++)
            result[i] = result[i - 1] + result[i - 2];

        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Fibonacci Numbers **
        System.out.print("Enter a value of n : ");
        int n = scanner.nextInt();

        int[] result = FirstNFibonacci(n);


        for (int j : result)
            System.out.print(j + " ");

        scanner.close();
    }
}
