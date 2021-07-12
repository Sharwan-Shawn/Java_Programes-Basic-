import java.util.Scanner;
public class total_of_N {
    public static void main(String ar[]){
        int a,b=0, i=1;
        Scanner s = new Scanner(System.in);
        System .out.println("Give your Input");
        a=s.nextInt();
        while(i<=a)
        {
            System.out.println(""+i);
            b=b+i;
            i++;
        }
        System.out.println("Total of N : "+b);
    }
}
