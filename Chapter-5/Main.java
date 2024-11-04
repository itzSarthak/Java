import java.util.Scanner;
class AccountHolder
{
    private String name;
    private String address;

    // Constructor
    public AccountHolder(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    // Copy constructor for deep copy **
    public AccountHolder(AccountHolder other)
    {
        this.name = other.name;
        this.address = other.address;
    }
}
class BankAccount
{
    // Encapsulating Properties **
    private String accountNumber;
    private double balance;

    private AccountHolder accountHolder;

    // This belongs to the whole class
    public static String ParentBank;

    static
    {
        ParentBank = "Reserve Bank of India";
    }

    // Default Constructor ** (In the absence of any constructor)

    // Parametrised Constructor **
    public BankAccount(String accountNumber, double initialBalance, AccountHolder accountHolder)
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

        // clone() to copy this property (in the case of an array) **
        this.accountHolder = accountHolder;
    }

    // Copy Constructor (Shallow Copy)
    public BankAccount(BankAccount bankAccount)
    {
        // left side is of the caller object
        // right side is of the passed object

        /*
            A shallow copy duplicates the top-level structure of the object but not the objects it references.
        */

        accountNumber = bankAccount.accountNumber;
        balance = bankAccount.balance;
        accountHolder = bankAccount.accountHolder;
    }

    // Deep Copy
    public BankAccount(BankAccount bankAccount,boolean flag)
    {
        accountNumber = bankAccount.accountNumber;
        balance = bankAccount.balance;

        //accountHolder = bankAccount.accountHolder;

        // Deep Copying With New Object **
        accountHolder = new AccountHolder(bankAccount.accountHolder);
    }
    /*
        In Java, this keyword represents the current instance of a class.

            1.Distinguishing Instance Variables:
                When parameters and instance variables have the same name,
                this helps specify that we’re referring to the instance variable.

            2.Calling Constructors:
                We can use this() to call another constructor in the same class, helping reduce redundancy.
                this(name, age)

            3.Passing the Current Instance:
                Sometimes we pass this to other methods (e.g., event listeners) to pass the current object.
    */

    // Public method to deposit money (controlled write access)
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited " + amount + ".\nNew balance: " + balance);
        }
        else
            System.out.println("Invalid deposit amount.");
    }

    // Public method to withdraw money with checks
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrew " + amount + ".\nNew balance: " + balance);
        }
        else
            System.out.println("Insufficient funds or invalid withdrawal amount");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}
