import java.util.Scanner;

/*public class Count_evndod {
    public static void main(String[]ar){
        int num=12345;
        int odd_count=0,even_count=0,count;

        while(num>0){
            count=num%10;
            if(count%2==0){
                even_count++;
            }
            else
                odd_count++;
            num=num/10;
        }
        System.out.println("count of even and odd are "+even_count+" and "+odd_count);
    }
}
*/
class solution {
    public static void main(String[] ar) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            total += a[i];
        }
        for (int j = 0; j < a.length; j++) {
            a[j] = a[j] * total;
        }
        for (int k : a) {
            System.out.print(k+",");
        }
    }
}