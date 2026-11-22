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

// scanner.nextInt() (পূর্ণসংখ্যা বা Integer-এর জন্য)
// scanner.nextDouble() (দশমিক সংখ্যা বা Double-এর জন্য)
// scanner.nextLong() (বড় পূর্ণসংখ্যার জন্য)
