import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        shape S;
        Rectangle R=new Rectangle();
        Triangle T=new Triangle();
        S=R;
        S.input();
        S.compute_area();

        S=T;
        S.input();
        S.compute_area();
    }
}

abstract class shape{
    private double a,b;
    abstract public void compute_area();

    Scanner sc=new Scanner(System.in);

    public double getval1(){
        return a;
    }
    public double getval2(){
        return b;
    }
   void input(){
        System.out.print("Enter input1==>");
        a=sc.nextDouble();
       System.out.print("Enter input2==>");
       b=sc.nextDouble();

   }


}

class Rectangle extends shape{
    double area;

    public void compute_area(){
        area=getval1()*getval2();
        System.out.println("Area of rectangle==>"+area);
    }
}
class Triangle extends shape{
    double area;

    public void compute_area(){
        area=getval1()*getval2()/2;
        System.out.println("Area of Triangle==>"+area);

    }
}
