import java.util.Scanner;

class Solu{

    int a[]=new int[5];
    int top=0;
    void push(int data){
        a[top]=data;
        top++;
    }
    int pop(){
        int data;
        top--;
        data=a[top];
        a[top]=0;
        return data;
    }
    int peek(){
        int data;
        data=a[top-1];
        return data;
    }
    void show(){
        for(int n:a){
            System.out.print(n+ " ");
        }

    }
}
public class Stack {
    public static void main(String[]ar){

        Solu nums = new Solu();

        nums.push(6);
        nums.push(7);

        nums.show();
        System.out.println(nums.pop());

        System.out.println(nums.peek());
    }
}
