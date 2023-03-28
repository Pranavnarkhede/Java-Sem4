import java.util.*;


public class Main {
    public static void main(String[] args) {

        int day, ht, lt, amountR, amountS;
        Scanner cin=new Scanner(System.in);

      Weather[] w=new Weather[20];

        System.out.print("Enter no of days==>");
        day=cin.nextInt();

        for(int i=0;i<day;i++){

            System.out.println("Enter details:");
            System.out.println("Enter highest temperature:");
            ht = cin.nextInt();
            System.out.println("Enter lowest temperature:");
            lt = cin.nextInt();
            System.out.println("Enter amount of rain:");
            amountR = cin.nextInt();
            System.out.println("Enter amount of snow:");
            amountS = cin.nextInt();

            w[i]=new Weather();
            w[i].Setdata(ht,lt,amountR,amountS);

        }





    }
}


class Weather {
    int day, ht, lt, amountR, amountS;

    Weather() {
        day = 0;
        ht = 0;
        lt = 0;
        amountR = 0;
        amountS = 0;

    }

    Weather(int a, int b, int c, int d, int e) {
        this.day = a;
        this.ht = b;
        this.lt = c;
        this.amountR = d;
        this.amountS = e;
    }

    public void Setdata(int a, int b, int c, int d) {

        this.day = a;
        this.ht = b;
        this.lt = c;
        this.amountR = d;

    }

}

