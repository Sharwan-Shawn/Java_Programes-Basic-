//constructor
class student{
    int id, mark1, mark2, mark3, total;
    String name;
    student(int x,String y){
        id=x;
        name=y;
    }
    int calc(int m1, int m2, int m3){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        total = mark1+mark2+mark3;
        return total;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("mark1 = "+mark1);
        System.out.println("mark2 = "+mark2);
        System.out.println("mark3 = "+mark3);
        //System.out.println("Total"+total);
        }
}
public class objclass_2 {
    public static void main(String[]ar){
        int a,avg;
        student s1=new student(100,"Sharwan");
        student s2=new student(102,"nila");
        a=s1.calc(90,80,80);
        System.out.println("Total of s1: "+a);
        avg=a/3;
        System.out.println("Avg of s1: "+avg);
        s1.display();

        a=s2.calc(90,69,78);
        System.out.println("Total of s2: "+a);
        avg=a/3;
        System.out.println("Avg of s2: "+avg);
        s2.display();
    }
}
