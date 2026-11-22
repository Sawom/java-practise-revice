import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks");
        float marks = scanner.nextInt();

        if(marks >=80 ){
            System.out.println("A+");
        }
        else if(marks >=75 ){
            System.out.println("A");
        }
        else if(marks >=70 ){
            System.out.println("A-");
        }
        else if(marks >=60 ){
            System.out.println("B");
        }
        else{
            System.out.println("You are fail: sorry!");
        }

    }
   
}