import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        float num1,num2;
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex result=new Complex();
        while (true)
        {
            System.out.println("\n1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.print("Enter your choice ==> ");
            Scanner cin=new Scanner(System.in);
            int choice=cin.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter first complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c1.setComplex(num1,num2);
                    System.out.println("Enter Second complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c2.setComplex(num1,num2);
                    result.addComplex(c1,c2);
                    System.out.print("Addition ==> ");
                    result.showComplex();
                    break;

                case 2:
                    System.out.println("Enter first complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c1.setComplex(num1,num2);
                    System.out.println("Enter Second complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c2.setComplex(num1,num2);
                    result.subComplex(c1,c2);
                    System.out.print("Subtraction ==> ");
                    result.showComplex();
                    break;
                case 3:
                    System.out.println("Enter first complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c1.setComplex(num1,num2);
                    System.out.println("Enter Second complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c2.setComplex(num1,num2);
                    result.mulComplex(c1,c2);
                    System.out.print("Multiplication ==> ");
                    result.showComplex();
                    break;

                case 4:
                    System.out.println("Enter first complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c1.setComplex(num1,num2);
                    System.out.println("Enter Second complex number==>");
                    num1=cin.nextFloat();
                    num2=cin.nextFloat();
                    c2.setComplex(num1,num2);
                    result.divComplex(c1,c2);
                    System.out.print("Division ==> ");
                    result.showComplex();
                    break;
                default:System.out.println("Invalid choice");
            }
        }
    }
}


class Complex{
    float real,imag;

    public Complex()
    {
        real=0;
        imag=0;
    }

    public Complex(float x,float y)
    {
        real=x;
        imag=y;
    }
    public void setComplex(float real, float imag){
        this.real=real;
        this.imag=imag;
    }
    public void showComplex(){
        System.out.println(real+"+("+imag+")i");
    }
    public void addComplex(Complex c1,Complex c2 ){
        this.real=c1.real+c2.real;
        this.imag=c1.imag+c2.imag;
    }
    public void subComplex(Complex c1,Complex c2){

        real=c1.real-c2.real;
        imag=c1.imag-c2.imag;
    }
    public void mulComplex(Complex c1,Complex c2){
       real=c1.real*c2.real-c1.imag*c2.imag;
       imag=c1.real*c2.imag+c1.imag*c2.real;
    }
    public void divComplex(Complex c1,Complex c2){

        Complex num = new Complex();
        Complex din =new Complex();
        num.mulComplex(c1,conjugateComplex(c2));
        din.mulComplex(c2,conjugateComplex(c2));

        this.real=num.real/ din.real;
        this.imag= num.imag/ din.real;
    }
    public Complex conjugateComplex(Complex c)
    {
        Complex temp=new Complex();
        temp.real=c.real;
        temp.imag=-c.imag;
        return temp;
    }
}
