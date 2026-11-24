/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

public class PatternTwo {
    public static void main(String[] args){
        int row,col;

        for(row=1;row<=5;row++){
            for(col=1; col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
}