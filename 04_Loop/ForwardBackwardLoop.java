public class ForwardBackwardLoop {
    public static void main(String[] args){
        int i;
        System.out.println("Forward: ");
        for(i=1; i<=10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Backward: ");
        for(i=10; i>=1; i--){
            System.out.print(i + " ");
        }

    }
}
