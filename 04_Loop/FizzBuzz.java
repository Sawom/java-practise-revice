/* 
FizzBuzz problem
print numbers from 1 to 20
if the number is divisible by 3, print "Fizz"
if the number is divisible by 5, print "Buzz"
if the number is divisible by 3 and 5, print "FizzBuzz"
else print the number
 */

public class FizzBuzz {
    public static void main(String[] args){
        int i;
        for (i=1; i<=20; i++){
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            } 
            else{
                System.out.println();
            }
            
        }

    }
}
