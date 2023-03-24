public class CarWithoutInheritance {
    private String make;
    private String color;
    private int year;
    private String model;
    private String classType;
    private String type;
    public CarWithoutInheritance(String make, String color, int year, String model, String classType, String type){
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
        this.classType = classType;
        this.type = type;
    }

    public void printDetails(){
        System.out.println("Manufacturer: "+ make);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+ year);
        System.out.println("Model: "+ model);
        System.out.println("Class: "+ classType);
        System.out.println("Type: "+ type);
    }
    public static void main(String[] args) {
        CarWithoutInheritance city = new CarWithoutInheritance("Honda", "Black", 2020, "City", "C", "Sedan");
        city.printDetails();
    }
}
