class student1{
    int id; String name;
    void sname() {
        id = 101;
        name = "shawn";
    }
}
class smark extends student1{
    int mark1,mark2,mark3,total,avg;
    void calc(){
        mark1= 80;
        mark2= 90;
        mark3= 99;
        total= mark1+mark2+mark3;
        avg=total/3;
    }
    void display(){
        System.out.println("ID : "+id );
        System.out.println("Name : "+name );
        System.out.println("mark1 : "+mark1 );
        System.out.println("mark2 : "+mark2 );
        System.out.println("mark3 : "+mark3 );
        System.out.println("Total : "+total );
        System.out.println("Avg : "+avg );

    }
}
public class inheritance_2 {
    public static void main(String[]ar){
        smark s=new smark();
        s.sname();
        s.calc();
        s.display();
    }
}