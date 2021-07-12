public class Pattern5_nested__for {
    public static void main(String [] ar){
        int i,j,a=5;

        for(i=1;i<=5;i++){

            for(j=1;j<=i;j++){
                System.out.print(a+ " ");
            }
            System.out.println();
            a--;

        }
    }
}

/*
    5
    4 4
    3 3 3
    2 2 2 2
    1 1 1 1 1
 */