import java.util.Scanner;

class Demo {
        int a, b, c;
        Scanner s=new Scanner(System.in);

        void setdata () {
            System.out.println("shii");
            a =s.nextInt();
            b =s.nextInt();
            c = a + b;
        }
        void setdata1(){
            c=a-b;
        }

        void display () {
            System.out.println(c);
        }
    }
class sum{
    public static void main(String[]ar){
        Demo a = new Demo();
        Demo b = new Demo();
        a.setdata();
        a.display();
        b.setdata1();
        b.display();
    }
}

