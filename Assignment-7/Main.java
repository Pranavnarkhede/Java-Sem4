import java.util.Scanner;
class Main {
    public static void main(String[] args) {


    Scanner cin = new Scanner(System.in);
    Exe e=new Exe();
    String a = "11.23";
    String b = "12.03";
  e.NumberFormat(a,b);
  int arr[]={1,2,3,4,5};
  int n=5;
  e.Array(arr,n);
  int num1=10;
  int num2=0;
  e.Arithmetic(num1,num2);
}
}

class Exe{
    public void NumberFormat(String a,String b){
        try{
            int c=Integer.parseInt(a);
            int d=Integer.parseInt(b);
            System.out.println("Value of a==>"+c);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception Occured");
        }
    }
    public void Arithmetic(int a,int b){
        try{
            int c=a/b;
            System.out.println("Division is==>"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
        }
    }
    public void Array(int arr[],int n){
        try{
            for(int i=0;i<=5;i++){
                System.out.println(arr[i]+"");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Out of Size");
        }
    }
}
