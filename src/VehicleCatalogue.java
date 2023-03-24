class Vehicle {

    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model){
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails(){
        System.out.println("Manufacturer: "+ make);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+ year);
        System.out.println("Model: "+ model);
    }
}

class Bike extends Vehicle{
    private String bodyStyle;
    public Bike(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void bikeDetails(){
        printDetails();
        System.out.println("Body style: " + bodyStyle);
    }

}

class Car extends Vehicle{
    private String classType;
    private String type;
    public Car(String make, String color, int year, String model, String classType, String type) {
        super(make, color, year, model);
        this.classType = classType;
        this.type = type;
    }

    public void carDetails(){
        printDetails();
        System.out.println("Class Of Car: " + classType);
        System.out.println("Type Of Car: "+ type);
    }

}

public class VehicleCatalogue{
    public static void main(String[] args) {
        Car city = new Car("Honda","black", 2023, "City", "C", "Sedan");
        city.carDetails();

        Bike r1 = new Bike("Yamaha", "blue", 2020, "R1", "Sports");
        r1.bikeDetails();
    }
}