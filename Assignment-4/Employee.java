package Assignment;

import java.util.Scanner;

public class Salary {
	
	
    public static void main(String args[]) {
    Scanner obj=new Scanner(System.in);
    
    int x;
    
    do {
    System.out.print("1.Programmer");
    System.out.print("2.Assistant Professor");
    System.out.print("3.Associate Professor");
    System.out.print("4.Team Lead");
    System.out.println("Enter your choice==>");
    x=obj.nextInt();
    
    switch(x) {
    
    
    case 1: Programmer p=new Programmer();
            System.out.println("Enter the basic pay of Programmer");
            p.getEmployeeDetails(obj.nextDouble());
             p.cal();
             break;
          
    case 2:  AssistantProfessor ap=new AssistantProfessor();
             System.out.println("Enter the basic pay of Assistant Professor");
            ap.getEmployeeDetails(obj.nextDouble());
            ap.cal();
            break;
    case 3:   AssociateProfessor asp=new AssociateProfessor();
              System.out.println("Enter the basic pay of Associate Professor");
              asp.getEmployeeDetails(obj .nextDouble());
             asp.cal();
             break;
    case 4: Professor prof=new Professor();
    	    System.out.println("Enter the basic pay of Professor");
    	    prof.getEmployeeDetails(obj.nextDouble());
    	    prof.cal();
    }
    
   
    }while(x!=0);
  obj.close();

 }
}

class Employee {
String employeeName;
int employeeID;
String address;
String mailID;
long mobileNumber;
double da,hra,pf,sc,ns,gs;
Scanner obj=new Scanner(System.in);


void getEmployeeDetails() {
	
	
   System.out.println("Enter the Employee Name:");
   employeeName=obj.nextLine();
   System.out.println("Enter the Employee Address: ");
  address=obj.nextLine();
  System.out.println("Enter the Employee Mail ID:");
  mailID=obj.nextLine();
  System.out.println("Enter the Employee ID:");
  employeeID=obj.nextInt();
  System.out.println("Enter the Employee Mobile Number:");
  mobileNumber=obj.nextLong();
}
                   
                   
void display() {
	
   System.out.println("Details==>");	
   System.out.println("Employee Name:"+employeeName);
   System.out.println("Employee ID:"+employeeID);
   System.out.println("EmpIoyee Address:"+address);
   System.out.println("Employee Mail ID :"+mailID); 
   System.out.println("EmpIoyee Mobile Number:"+mobileNumber);
   System.out.println("DA:"+da);
   System.out.println("HRA:"+hra);
   System.out.println("PF:"+pf);
   System.out.println("SC:"+sc);

}

}


class Programmer extends Employee {
  double basicPay;
   public double getBasicPay() {
   return basicPay;
 }
  public void setBasicPay(double basicPay) {
 this. basicPay = basicPay;
}
void getEmployeeDetails(double bp) {
  
  super.getEmployeeDetails();
setBasicPay(bp);
}
   void cal(){
   da=getBasicPay()* 97/100.0;  
   hra=getBasicPay()* 10/100.0;
   pf=getBasicPay()* 12/100.0;
   sc=getBasicPay()* 0.1/100.0;

   gs=getBasicPay()+da+hra;
   ns=gs-pf-sc;
 display();
}



void display() {
   super.display();

   System.out.println("Employee Gross Salary:"+gs);
   System.out.println("Employee Net Salary :"+ns);
}
}
  



class AssistantProfessor extends Employee {
double basicPay;
public double getBasicPay() {
return basicPay;
}

public void setBasicPay(double basicPay) {
this.basicPay = basicPay;
}
  
  
  
void getEmployeeDetails(double bp) {
   super.getEmployeeDetails();
   setBasicPay(bp);
}
void cal(){
da=getBasicPay()* 97/ 100.0;
hra=getBasicPay()*10/100.0;
pf=getBasicPay()* 12/ 100.0;
sc=getBasicPay()*0.1/100.0;
gs=getBasicPay()+da+hra;
ns=gs-pf-sc;
display();
}
void display() {
super.display();

System.out.println("EmpIoyee Gross Salary:"+gs);
System.out. println("Employee Net Salary:"+ns);
}
}
    
 class AssociateProfessor extends Employee {
double basicPay;
public double getBasicPay() {
return basicPay;
}
public void setBasicPay(double basicPay) {
this.basicPay = basicPay;
}
void getEmployeeDetails(double bp) {
super.getEmployeeDetails();
setBasicPay(bp);
}
void cal(){
da=getBasicPay()* 97/100.0;
hra=getBasicPay()*10/100.0;
pf=getBasicPay()* 12/100.0;
sc=getBasicPay()* 0.1/ 100.0;
gs=getBasicPay()+da+hra;
ns=gs-pf-sc;
display();
}
void display(){
super.display();
System.out.println("Employee Gross Salary:"+gs);
System.out.println("Employee Net Salary :"+ns);
}
}
  
  
 class Professor extends Employee{
double basicPay;
public double getBasicPay() {
return basicPay;
}
public void setBasicPay(double basicPay) {
this.basicPay = basicPay;
}
void getEmployeeDetails(double bp) {
super.getEmployeeDetails();
setBasicPay(bp);
}
void cal() {
    da=getBasicPay()*97/100.0;
   hra=getBasicPay()*10/100.0;
   pf=getBasicPay()* 12/100.0;
   sc=getBasicPay()* 0.1/100.0;
   gs=getBasicPay()+da+hra;
   ns=gs-pf-sc;
    display();
}
   void display() {
  
   super.display();
   System.out.println("Employee Gross Salary:"+gs);
   System.out.println("Employee Net Salary :"+ns);
  
}
 }


