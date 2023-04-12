import java.util.Scanner;
public class Main {
    static void area(int side){
        System.out.println("Area of Square==>"+side*side);
    }
    static void area(float radius){
        System.out.println("Area of Circle==>"+3.14*radius*radius);
    }
    static void area(int base,int height){
        System.out.println("Area of triangle==>"+0.5*base*height);
    }
    static void area(double length,double breadth){
        System.out.println("Area of Rectangle==>"+length*breadth);
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter side of square==>");
        int side=cin.nextInt();
        area(side);
        System.out.println("Enter radius of circle");
        float radius=cin.nextFloat();
        area(radius);
        System.out.println("Enter base and height of Triangle");
        int base=cin.nextInt();
        int height=cin.nextInt();
        area(base,height);
        System.out.println("Enter length and breadth of rectangle");
        double length=cin.nextDouble();
        double breadth=cin.nextDouble();
        area(length,breadth);
    }
}
