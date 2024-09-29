import java.util.Scanner;

class Car{
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public void Printing(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
public class CarDealership{
public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter car make:");
    String make=scanner.nextLine();
    System.out.println("Enter car model");
    String model=scanner.nextLine();
    System.out.println("Enter car year");
    int year=scanner.nextInt();
    System.out.println("Enter car price");
    double price=scanner.nextDouble();
    Car car = new Car(make, model, year, price);
        System.out.println("\nCar Details:");
        car.Printing();
    scanner.close();
}
}