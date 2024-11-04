// Base class
class Vehicle
{
    // user 2 remember ***
    protected String brand;

    public Vehicle(String brand)
    {
        this.brand = brand;
    }

    // Member Functions (METHODS)
    public void start()
    {
        System.out.println("Vehicle is starting...");
    }
    public void stop()
    {
        System.out.println("Vehicle is stopping...");
    }
}

// Single Inheritance: Car is a subclass of Vehicle *
class Car extends Vehicle
{
    private int speed;

    // Notice the syntax **
    public Car(String brand, int speed)
    {
        // Calling the superclass constructor (super keyword)
        super(brand);
        this.speed = speed;
    }

    public void accelerate()
    {
        System.out.println(brand + " car is accelerating at " + speed + " km/h.");
    }
}

// Multilevel Inheritance: ElectricCar inherits from Car
class ElectricCar extends Car implements ElectricVehicle,SelfDriving
{
    private int batteryLife;

    public ElectricCar(String brand, int speed, int batteryLife)
    {
        // super keyword to invoke parent constructor **
        super(brand, speed);
        this.batteryLife = batteryLife;
    }

    // Implementing the contract declared in Electric Vehicle Interface
    // An example of Multiple Inheritance **
    @Override
    public void chargeBattery()
    {
        System.out.println("Charging battery... Battery life is now " + batteryLife + "%.");
    }
    @Override
    public void enableAutoPilot()
    {
        System.out.println("Autopilot is enabled for " + brand + " electric car.");
    }

}

// Hierarchical Inheritance: Motorcycle also inherits from Vehicle
class Motorcycle extends Vehicle
{
    public Motorcycle(String brand)
    {
        super(brand);
    }

    public void wheelie()
    {
        System.out.println(brand + " motorcycle is doing a wheelie!");
    }
}

interface ElectricVehicle
{
    void chargeBattery();
}
interface SelfDriving
{
    void enableAutoPilot();
}
/*
    In Java, an interface is a reference type similar to a class,
    but it can contain only constants, method signatures, default methods, static methods, and nested types.
    Interfaces cannot contain instance fields or constructors.

    ** The methods in interfaces are abstract by default, which means they do not have a body.

    $$ Interfaces are used to achieve abstraction and multiple inheritance in Java.
    -- Electric Car Implements two interfaces & it is an example of Multiple Inheritance **

    $$ By using interfaces, you can define a contract for classes, ensuring they implement specific methods.
*/
public class Main
{
    public static void main(String[] args)
    {
        // Single inheritance example
        Car car = new Car("Toyota", 120);
        car.start();
        car.accelerate();
        car.stop();

        System.out.println();

        // Multilevel inheritance example
        ElectricCar electricCar = new ElectricCar("Tesla", 150, 85);
        electricCar.start();
        electricCar.accelerate();
        electricCar.chargeBattery();
        electricCar.stop();

        System.out.println();

        // Hierarchical inheritance example
        Motorcycle motorcycle = new Motorcycle("Harley");
        motorcycle.start();
        motorcycle.wheelie();
        motorcycle.stop();
    }
}
