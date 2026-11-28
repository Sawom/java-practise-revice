// input an array and then print output
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        int i,n;
        System.out.println("Enter size of an array: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int [] numbers = new int[n];

        System.out.println("Enter numbers: ");
        for(i=0;i<n;i++){
            numbers[i] = input.nextInt();
        }

        System.out.println("Your output numbers: ");
        for(i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}