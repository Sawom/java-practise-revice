/* 

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class PatternFive {
    public static void main(String[] args){
        int row,col;

        int cell_no = 1;
        for (row=1;row<=5;row++){
            for(col=1;col<=row;col++){
                System.out.print(cell_no++ +" ");
            }
            System.out.println();
        }

    }
}