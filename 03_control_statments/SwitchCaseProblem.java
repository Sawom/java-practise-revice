// result calculation with switch case
import java.util.Scanner;

public class SwitchCaseProblem {
    public static  void main(String[] args){
        int marks;
        System.out.println("Enter your marks: ");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();

        switch((marks/10)){
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A"); 
                break;
            case 7:
                System.out.println("A-");
                break;
            case 6:
                System.out.println("B+");
                break;
            case 5:
                System.out.println("B");
                break;
            case 4:
                System.out.println("C");
            default:
                System.out.println("F");
             
        }

    }
}
