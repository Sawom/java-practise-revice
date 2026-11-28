/* 

x       x
  x   x  
    x    
   x  x  
x       x

*/

public class PatternSix {
    public static void main(String[] args) {
        int n = 9;
        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                if (r == c || r+c+1 == n) {
                        System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
