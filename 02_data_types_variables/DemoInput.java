import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // for string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello! " +name+ "you are" + age);
        scanner.close();
    }
}

// scanner.nextFloat() — float এর জন্য
// scanner.nextDouble() — double এর জন্য
// scanner.nextInt() — int এর জন্য
// scanner.nextLong() — long এর জন্য
// scanner.nextShort() — short এর জন্য
// scanner.nextByte() — byte এর জন্য
// scanner.nextBoolean() — boolean (true বা false) এর জন্য
// scanner.nextLine(); // for string input