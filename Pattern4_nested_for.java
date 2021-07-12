public class Pattern4_nested_for {
    public static void main(String [] ar){
        int i,j;

        for(i=5;i>=1;i--){

            for(j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();

        }
    }
}


/*
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1
 */