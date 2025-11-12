import java.util.Scanner;
class circle {
    private double radius;
    
    public double calculateArea(){
        double area =this.radius*radius*22/7;
        return area;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

}

public class CircleApp {
    public static void main(String[] args) {
        circle Circle= new circle();
        Scanner Get= new Scanner(System.in);

        System.out.print("Enter the Radius for the Circle : ");
        Circle.setRadius(Get.nextDouble());
        System.out.println("The area of the circle is : "+Circle.calculateArea());
    }
}