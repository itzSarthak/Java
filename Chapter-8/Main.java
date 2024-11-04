// Base class

/*
    1. Compile Time Polymorphism (Static Binding)
        $$ Method overloading allows multiple methods with the same name to exist in the same class,
           differentiated by their parameter lists (type, number, or both).
           
    2. Runtime polymorphism (Dynamic Binding)
        $$ Occurs when a subclass overrides a method of its superclass.
            The method to be executed is determined at runtime based on the object being referred to.
*/
class Animal
{
    // Note that this method has a body **
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cat meows");
    }
}

// Subclass Cow
class Cow extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cow moos");
    }
}

// AnimalShelter class to demonstrate polymorphism
class AnimalShelter
{
    public void makeAnimalSound(Animal animal)
    {
        // Calls the overridden method based on the object type
        animal.sound();
    }
}

// Main class
public class Main
{
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        AnimalShelter shelter = new AnimalShelter();

        // Demonstrating runtime polymorphism
        shelter.makeAnimalSound(dog); // Outputs: Dog barks
        shelter.makeAnimalSound(cat); // Outputs: Cat meows
        shelter.makeAnimalSound(cow); // Outputs: Cow moos
    }
}
