import java.util.Scanner;

public class largest_of_two_num {
    public static void main(String[]ar){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if (a>b){
            System.out.println(a+" is largest number.");
        }
        else if (a==b){
            System.out.println(a+ " and "+b+" are equal.");
        }
        else{
            System.out.println(b+" is largset number");
        }
    }
}
