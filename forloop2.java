import java.util.Scanner;
//Total Of Even
public class forloop2 {
    public static void main(String []ar){
        int i,a,b=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Give your limit");
        a=s.nextInt();
        for(i=1;i<=a;i++){
            System.out.println(i);
            if(i%2==0){
                b=b+i;
            }
        }
        System.out.println("Total Of Even : "+b);
    }
}
