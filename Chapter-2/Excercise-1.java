import java.util.Scanner;
public class Main
{
  // Palindrome Checker ***
    public static boolean IsPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        str = str.toLowerCase();

        while(i < j)
        {
            // Notice we can't access the character in an array form **
            if(str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Palindrome Checker **
        System.out.print("Enter a string to check Palindrome : ");
        String input;
        input = scanner.next();

        System.out.println(IsPalindrome(input));

        scanner.close();
    }
}
