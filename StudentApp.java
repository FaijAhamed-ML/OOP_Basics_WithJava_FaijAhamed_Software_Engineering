import java.util.Scanner;
class Students {
    int studentId;
    String name;
    double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa<=4.0 && gpa >0.0){
            this.gpa = gpa;
        }else {
            System.out.println("Enter the correct gpa");
        }
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudentsDetails(){
        System.out.println("Sustednt name is :"+getName());
        System.out.println("Sudent's GPA is :"+getGpa());
        System.out.println("Student's ID is :"+getStudentId());
    }
}
public class StudentApp{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Students student = new Students();

    System.out.print("Enter the Student ID: ");
    student.setStudentId(scanner.nextInt());
    
    scanner.nextLine(); // consume end-of-line after nextInt

    System.out.print("Enter the Student Name: ");
    student.setName(scanner.nextLine());

    System.out.print("Enter the Student's GPA: ");
    student.setGpa(scanner.nextDouble());

    // print details
    student.displayStudentsDetails();

    }

}