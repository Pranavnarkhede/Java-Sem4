import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        shape S;
        Rectangle R=new Rectangle();
        Triangle T=new Triangle();
        Square Sq=new Square();
        Circle C=new Circle();
        S=R;
        S.input();
        S.compute_area();

        S=T;
        S.input();
        S.compute_area();
        
        S=Sq;
        S.input();
        S.compute_area();
        
         
        S=C;
        S.input();
        S.compute_area();
    }
}

abstract class shape{
    double a,b;
    abstract public void compute_area();

    Scanner sc=new Scanner(System.in);
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
        area=a*b;
        System.out.println("Area of rectangle==>"+area);
    }
}
class Triangle extends shape{
    double area;

    public void compute_area(){
        area=a*b/2;
        System.out.println("Area of Triangle==>"+area);

    }
}
class Square extends shape{
    double area;
    
    public void input(){
        System.out.println("Enter the side of square==>");
        a=sc.nextDouble();
    }
      public void compute_area(){
        area=a*a;
        System.out.println("Area of Square==>"+area);
    }
    
}


class Circle extends shape{
    double area;
    
    public void input(){
        System.out.println("Enter the radius of circle==>");
        a=sc.nextDouble();
    }
      public void compute_area(){
        area=3.14*a*a;
        System.out.println("Area of Circle==>"+area);
    }
    
}
