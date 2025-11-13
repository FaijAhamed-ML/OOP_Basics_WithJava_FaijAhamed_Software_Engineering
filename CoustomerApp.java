import java.util.Scanner;
class Customer{
    int CustomerId;
    String Name;
    int unitesConsumed;


    public void Customer(int CustomerId,String Name,int unitesConsumed){
        this.CustomerId = CustomerId;
        this.Name = Name;
        this.unitesConsumed = unitesConsumed;
    }


    public int getCustomerId(){
        return CustomerId;
    }
    public String getName(){
        return Name;
    }
    public int getunitesConsumed(){
        return unitesConsumed;
    }


    public void setCustomerId(int CustomerId){
        this.CustomerId = CustomerId;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setUnitesConsumed(int unitesConsumed){
        this.unitesConsumed = unitesConsumed;
    }


    public double calculateBill(){
        double price=0.0;
        if (unitesConsumed>300){
            price=40.0;
        }else if (unitesConsumed<=300 && unitesConsumed>=101){
            price=30.0;
        }else if (unitesConsumed<=100){
            price=20.0;
        }
        return price*(double)unitesConsumed;
    }


    public void displayCustomerDetails(){
        System.out.println("\ncustomer Details:");
        System.out.println("Customer Id: "+getCustomerId());
        System.out.println("Name: "+getName());
        System.out.println("Units Consumed: "+getunitesConsumed());
        System.out.println("Bill Amount: Rs. "+calculateBill());
    }
}

public class CoustomerApp {
    public static void main(String[] args) {
        Scanner Get= new Scanner(System.in);
        Customer Cus1= new Customer();

        System.out.print("Enter Customer ID: ");
        Cus1.setCustomerId(Get.nextInt());
        Get.nextLine();
        System.out.print("Enter Customer Name: ");
        Cus1.setName(Get.nextLine());
        System.out.print("Enter Customer Consumed: ");
        Cus1.setUnitesConsumed(Get.nextInt());
        Cus1.displayCustomerDetails();

    }
}