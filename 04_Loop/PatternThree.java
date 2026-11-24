/*

a
a b
a b c
a b c d
a b c d e

*/

public class PatternThree {
     public static void main(String[] args){
        int row,col, decimalValue = 97;
        char  char_value;

        for(row=1;row<=5;row++){
            for(col=1; col<=row;col++){
                char_value = (char) (decimalValue+col-1);
                System.out.print(char_value + " ");
            }
            System.out.println();
        }

    }
}
