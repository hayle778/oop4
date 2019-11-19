package com.company;


import java.util.ArrayList;
import java.util.Scanner;

//no overtime
public class Main{

   // private static Object Employee;

    public static void main(String[] args) {
        // write your code here

        String  firstname = "";
        String lastname = "";
        double hourspay = 0.0;
        int hoursaweek = 0;
         double weekpay = 0.0;
        double annualsalary =0.0;
        double x = 0.0;
        double overtime = 0.0;
        ArrayList<Employee> g= new ArrayList<>();

      //  g.add(Employee);

        Scanner input = new Scanner(System.in );
      Employee employee = new Employee();

      for(int i =0; i<1; i++)


          System.out.println("please enter the firstname");
          firstname= input.nextLine();
          employee.getFirstname(firstname);
          System.out.println("please enter lastname");
          lastname= input.nextLine();
         employee.getLastname(lastname);
          System.out.println("please enter hourspay");
           hourspay = input.nextDouble();
           employee.gethourspay(hourspay);
           System.out.println("please enter hoursaweek");
           hoursaweek = input.nextInt();
            employee.gethoursaweek(hoursaweek);
         System.out.println(" weekpay ");
          //  weekpay = input.nextDouble();
            employee.getweeklypay(hoursaweek*hourspay+(1.5*overtime));
          System.out.println("annualsalary");
            employee.getannualsalary(52*40*hourspay+(overtime*1.5*(hoursaweek-40)));


          // annualsalary = input.nextDouble();
           //  employee.getannualsalary(40 * hourspay + (overtime * 1.5 * (hoursaweek - 40)));
           // annualsalary1 = 240*hoursaweek*hourspay;
       // System.out.println("" + employee.getName()+""+ employee.getLastname()+""+employee.gethourspay()+
              //      employee.gethoursaweek());
       // System.out.println("Annual salary"+ employee.getannualsalary());
      //  double x =
        System.out.println(employee.toString());
    }
   //  double x=0.0;
   //    for(double x : )



}




