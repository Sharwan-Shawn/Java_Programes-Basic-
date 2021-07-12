public class Tri_pattern_nested_for {
    public static void main(String []ar){
        int a,i,j,b;
        for (i=5,b=1;i>=1;i--,b++){

            for (j=1;j<=i;j++){
                System.out.print(" ");

            }
            for (a=1;a<=b;a++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
/*
    *
   * *
  * * *
 * * * *
* * * * *
 */