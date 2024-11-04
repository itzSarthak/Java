// Abstract Class
// Can't be instantiated **
abstract class Animal
{
    protected String name;
    // Constructor
    public Animal(String name)
    {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method (shared)
    public void eat()
    {
        System.out.println(name + " is eating.");
    }
}

// Concrete class that extends the abstract class
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    // Implementing the abstract method
    @Override
    public void makeSound()
    {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Another concrete class that extends the abstract class
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    // Implementing the abstract method
    @Override
    public void makeSound()
    {
        System.out.println(name + " says: Meow Meow!");
    }
}

// An interface
interface Pet
{
    // Method inside interfaces are abstract by default **

    // However they can have default body **
    default void play()
    {
        System.out.println("Default Implementations from an interface .");
    }
}

// Dog class implements the Pet interface
class PetDog extends Dog implements Pet
{
    public PetDog(String name)
    {
        super(name);
    }

    @Override
    public void play()
    {
        System.out.println(name + " is playing fetch!");
    }
}

// Cat class implements the Pet interface
class PetCat extends Cat implements Pet {
    public PetCat(String name)
    {
        super(name);
    }

    @Override
    public void play()
    {
        System.out.println(name + " is playing with yarn!");
    }
}

// Main class to demonstrate abstraction
public class Main
{
    public static void main(String[] args)
    {
        // Creating instances of the concrete classes **
        Animal dog = new PetDog("Buddy");
        dog.makeSound();
        dog.eat();

        // Syntax to invoke methods defined in an interface **
        ((Pet) dog).play();

        System.out.println();

        Animal cat = new PetCat("Kitty");
        cat.makeSound();
        cat.eat();
        ((Pet) cat).play();
    }
}
