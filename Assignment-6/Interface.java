import java.util.*;

interface vehicle {
    void gear_change(int a);
    void speed_up();
    void apply_brakes();
    void display();

}

//BICYCLE CLASS
class bicycle implements vehicle
{
    int gear,speed;

    bicycle()
    {
        System.out.println("Bicycle started successfully");
        gear=0;
        speed=0;
    }

    public void gear_change(int gearex)
    {
        if(gearex<7 && gearex>0)
        {
            gear=gearex;
            System.out.println("Current Gear Is "+gear);
        }
        else
            System.out.println("Gear is Out Of Range ");
    }

    public void speed_up()
    {
        if((speed+5)<50 ) {
            speed+=5;
            System.out.println(" current speed is "+speed);
        }
        else
            System.out.println("Speed Cannot Be Increased Above 50 ");
    }

    public void apply_brakes()		//function to apply brakes
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");
        x=sc.nextInt();

        if(x==1)
            if((speed-5)>0)
            {
                speed-=5;
                System.out.println("Current speed is "+speed);
            }
            else {
                speed=0;
                gear=0;
                System.out.println("Bicycle stopped Successfully");}

        if(x==2)
        {
            speed=0;
            gear=0;
            System.out.println("Bicycle stopped Successfully");
        }

    }

    public void display()
    {
        System.out.println("YOUR  BICYCLE'S SPEED IS "+speed +" AND GEAR IS "+gear);
    }
}





class car implements vehicle
{
    int gear,speed;

    car()
    {
        System.out.println("Car started successfully\n ");
        gear=0;
        speed=0;
    }
    public void gear_change(int gearex)
    {
        if(gearex<7 && gearex >0)
        {
            this.gear=gearex;
            System.out.println(" Current Gear is "+gear);
        }
        else
            System.out.print(" Gear Out Of Range \n");
    }

    public void speed_up()
    {

        if((speed+20)<150 )
        {
            speed+=20;
            System.out.println("Current speed is "+speed);
        }
        else
            System.out.println("Speed Cannot Be Increased Above 150 ");

    }

    public void apply_brakes()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");
        x=sc.nextInt();
        if(x==1)
            if((speed-20)>0)
            {
                speed-=20;
                System.out.println("Current Speed Is "+speed);
            }
            else {
                speed=0;
                gear=0;
                System.out.println("Car stopped Successfully ");}
        if(x==2)
        {
            speed=0;
            gear=0;
            System.out.println("Car stopped Successfully ");
        }
    }

    public void display()		//displays current status of car
    {
        System.out.println("YOUR  CAR'S SPEED IS "+speed +" AND GEAR IS "+gear);
    }

}


//BIKE CLASS

class bike implements vehicle
{
    int gear,speed;

    bike()
    {
        System.out.println("\tBike started successfully \n");
        gear=0;
        speed=0;
    }
    public void gear_change(int gearex)
    {
        if(gearex<6 && gearex>0)
        {
            gear=gearex;
            System.out.println(" Current Gear IS "+gear);
        }
        else
            System.out.println("Gear out of range \n");
    }

    public void speed_up()
    {
        if((speed+20)<100 )
        {
            speed+=20;
            System.out.println(" Current speed is "+speed+" .\n");
        }
        else
            System.out.println("Speed Cannot Be Increased Above 100");

    }
    public void apply_brakes()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("1. TO DECREASE SPEED\n2. TO STOP bike\n");
        x=sc.nextInt();
        if(x==1)
            if((speed-20)>0)
            {
                speed-=20;
                System.out.println("Current speed is "+speed);
            }
            else {
                speed=0;
                gear=0;
                System.out.println("Bike stopped Successfully \n");}
        if(x==2)
        {
            speed=0;
            gear=0;
            System.out.println("Bike stopped Successfully \n");
        }
    }
    public void display()
    {
        System.out.println("YOUR  BIKE'S SPEED IS "+speed +"  AND GEAR IS "+gear+"\n");
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        vehicle v=null;

        int y;
        bb:
        do {
            System.out.print("  SELECT VEHICLE  \n1.BICYCLE \n2.CAR  \n3.BIKE \n4.Exit \nChoice::");
            y=sc.nextInt();
            if(y==1)
                v=new bicycle();
            else if(y==2)
                v= new car();
            else if(y==3)
                v=new bike();
            else if(y==4)
                break bb;
            else
                System.out.println("INVALID INPUT");
            if(y<4) {
                aa:
                do {
                    System.out.print("Press 1. Speed Up \nPress 2. Change gear \nPress 3. Apply Brakes  "
                            + "\nPress 4. Display Vehicle Status \nPress 5. change Vehicle /Exit \nChoice::");
                    int z=sc.nextInt();

                    switch(z)
                    {
                        case 1:
                            v.speed_up();
                            break;
                        case 2:
                            System.out.print("which gear you want?   ");
                            int a=sc.nextInt();
                            v.gear_change(a);
                            break;

                        case 3:
                            v.apply_brakes();
                            break;
                        case 4:
                            v.display();
                            break;
                        case 5:
                            break aa;
                        default:
                            System.out.println("Invalid Input");

                    }
                }while(true);
            }



        }while(y!=4);
    }

}
