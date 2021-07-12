public class Pattern3_nested_for {
    public static void main(String [] ar){
        int i,j,a=1;

        for(i=5;i>=1;i--){

            for(j=1;j<=i;j++){
                System.out.print(a+ " ");
            }
            System.out.println();
            a++;

        }
    }
}

/*
    1 1 1 1 1
    2 2 2 2
    3 3 3
    4 4
    5
 */
