public class Pattern2_nested_for {
    public static void main(String []ar){
        int i,j;
        for( i=5;i>=1 ;i-- ){

            for( j=1;j<=i ;j++ ){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }
}
/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */