import java.util.Scanner;
class Car{
    private String regNumber;
    private String modelName;
    private double price;

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public Car(String regNumber, String modelName, double price){
        this.regNumber = regNumber;
        this.modelName = modelName;
        this.price = price;
    }
    public Car(){
        this.regNumber = "egNumber";
        this.modelName = "modelName";
        this.price = 0.0;
    }

    public String GetRegNumber(){
        return regNumber;
    }
    public String GetModelName(){
        return modelName;
    }
    public double GetPrice(){
        return price;
    }

    public void DisplayCarDetails(){
        System.out.println("this Car's Reg Number is: "+GetRegNumber());
        System.out.println("This car's Model Name is : "+GetModelName());
        System.out.println("This Car's Price is : "+GetPrice());
    }

}
public class CarApp {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Car car1= new Car();

        System.out.println("default constructor Details : ");
        car1.DisplayCarDetails();

        System.out.println(" ");

        System.out.println("Perameterlized constructors values : ");

        Car car2= new Car("CAK-1122", "BMW-M6", 53600000.0);

        car2.DisplayCarDetails();


    }
}
