import java.util.Scanner;
class student2{
    int id;String name;
    void input(){
        Scanner s = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your ID and Name :");
        id=s.nextInt();
        name=x.nextLine();
    }
    void DisplayInput(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
class Smarks extends student2{
    int mark1,mark2,mark3;
    void marks(){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        mark1=y.nextInt();
        mark2=y.nextInt();
        mark3=y.nextInt();
    }
    void Displaymarks(){
        System.out.println("Mark1 : "+mark1);
        System.out.println("Mark2 : "+mark2);
        System.out.println("Mark3 : "+mark3);
    }
}
class calc extends Smarks{
    int total,avg;
    void calculate(){
        total=mark1+mark2+mark3;
        avg=total/3;
    }
    void Displayclac(){
        System.out.println("Total : "+total);
        System.out.println("Avg : "+avg);
    }
}
public class multiple_inheritance {
    public static void main(String[]ar){
        calc c = new calc();
        c.input();
        c.DisplayInput();
        c.marks();
        c.Displaymarks();
        c.calculate();
        c.Displayclac();
    }
}