import java.util.Scanner;

public class Binary_Search {
    public static void main(String []ar){
        int a[]={10,20,30,40,50,60,70,80,99,100};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value to search: ");
        int key=in.nextInt();
        int l=0,h=a.length-1,flag=0;
        while(l<=h){
            int m = l+h/2;
            if(a[m]==key){
                System.out.println("value found at "+m);
                flag++;
                break;
            }
            if (a[m]>key){
                h=m-1;
            }
            else {
                l = m + 1;
            }
        }
        if(flag==0)
            System.out.println(key+ " is not found");
    }
}
