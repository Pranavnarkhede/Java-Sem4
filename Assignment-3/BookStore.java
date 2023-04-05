
import java.util.Scanner;

public class Bookstore {

    public static void main(String[] args) {


        Scanner cin=new Scanner(System.in);

        Books b=new Books();

        Magazine m=new Magazine();

        int k;

        System.out.println("1.Books \n2.Magazine\n 3.Total");

        System.out.println("Enter your choice==>");

        k=cin.nextInt();


        if(k==1) {
                   int a,d;
            do {

                System.out.print("1.Read Books \n2.Display Books \n3.Order Copies\n");

                System.out.println("Enter your choice==>");

                a=cin.nextInt();

                switch(a) {

                    case 1: b.read_book();

                        break;

                    case 2: b.display_book();

                        break;

                    case 3:System.out.println("Enter number of copies you want");

                        int c=cin.nextInt();

                        b.ordercopies(c);

                        break;
                    case 4:System.out.print("Enter copies you want to order");
                           int n=cin.nextInt();
                           b.sale_pub(n);


                }
                System.out.println("Do you want to continue==>(1/0)");
                d=cin.nextInt();

            }while(d==1);

        }


        else if(k==2) {
                 int p,q;
            do {

                System.out.print("1.Read Mqagazine \n2.Display Magazine \n3.Issue Magazine");

                System.out.println("Enter your choice==>");

                p=cin.nextInt();

                switch(p) {

                    case 1: m.readmag();
                            break;

                    case 2: m.display_mag();
                            break;
                    case 3:System.out.print("Enter copies you want to order");
                           int n=cin.nextInt();
                           m.sale_pub(n);
                           break;

                    case 4:System.out.println("Enter the issue year");
                          String c=cin.next();
                           m.receive_issue(c);
                         break;

                }
                System.out.println("Do you want to continue==>(1/0)");
                q=cin.nextInt();

            }while(q!=0);


        }
        else if(k==3){
            System.out.print("Total Amount==>"+(b.gettotal()+m.gettotal()));

        }
        else{
            System.out.print("Invalid Key");
        }

    }

}



class Publication {

    private String title;

    private double price;

    private int copies;

    private int total;


    Scanner sc = new Scanner(System.in);
    public int getCopies() {
        return copies;
    }
    public void setTotal(int total){
        this.total=total;
    }
    public int gettotal(){
        return total;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    void read_pub() {

        System.out.println("Enter the Title of book==>");
        title = sc.nextLine();
        System.out.println("Enter the Price of book==>");
        price = sc.nextDouble();
        System.out.println("Enter the copies of book==>");
        copies = sc.nextInt();
    }


    void display() {

        System.out.println(" Title of book==>" + title);
        System.out.println("Price of book==>" + price);
        System.out.println("Copies of book==>" + copies);


    }

    void sale_pub(int number) {


        if (number <= copies) {
            copies = copies - number;
            total = (int) (total + number * price);
            System.out.println("\tYOU PURCHASED " + number + " COPIES \n\tYOU HAVE TO PAY : " + (price * number));
        } else {
            System.out.println("Out Of Stock");
        }
    }
}

class Books extends Publication{

    private String author;
    public void ordercopies(int number) {

        int x= getCopies()+number;
        setCopies(getCopies()+number);
        System.out.println("\n\tORDER SUCESSFUL....");
        System.out.println("\tCOPIES AVAILABLE : "+x);

    }
    void read_book() {
        super.read_pub();
        System.out.println("Enter the Author of the book==>");
        author = sc.next();
    }
    void display_book() {
        super.display();
        System.out.println("The Author is "+author);
    }
}

class Magazine extends Publication{

    private int orderQty;
    private String issue_year;
    void readmag(){

        read_pub();

        System.out.println("Enter the issue year");

        issue_year=sc.next();
    }


    void receive_issue(String issueyear) {


        System.out.println("Enter new copies==>");

        orderQty=sc.nextInt();

        setCopies(orderQty);

        issue_year=issueyear;

        System.out.print("Magazine ==>"+getTitle());

        System.out.print("Issue Year==>"+issue_year);


    }

    void display_mag() {

        super.display();

        System.out.println("\t"+issue_year);


    }
}
