/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

public class PatternFour {
    public static void main(String[] args){
        int row,col;

        for(row=5;row>=1;row--){
            for(col=1; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
