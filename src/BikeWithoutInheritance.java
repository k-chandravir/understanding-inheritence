public class BikeWithoutInheritance {
    private String make;
    private String color;
    private int year;
    private String model;
    private String bodyStyle;
    public BikeWithoutInheritance(String make, String color, int year, String model, String bodyStyle){
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
        this.bodyStyle = bodyStyle;
    }

    public void printDetails(){
        System.out.println("Manufacturer: "+ make);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+ year);
        System.out.println("Model: "+ model);
        System.out.println("Body: "+ bodyStyle);
    }
    public static void main(String[] args) {
        BikeWithoutInheritance r1 = new BikeWithoutInheritance("Yamaha", "blue", 2020, "R1", "naked");
        r1.printDetails();
    }
}
