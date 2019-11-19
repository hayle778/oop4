package com.company;


public class Employee {            // if the employee worked more than 40 hours, the employee gets 1.5X for every hour over40 hrs.
    private String firstname;
    private String lastname;
    private double hourspay;
    private int hoursaweek;
    private double weeklypay;
    private double annualsalary;
    public Employee() {
    }

    public Employee(String firstname, String lastname, double hourspay, int hoursaweek, double weeklypay) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.hourspay = hourspay;
        this.hoursaweek = hoursaweek;
        this.weeklypay = weeklypay;
        this.annualsalary = annualsalary;
    }

    public String getFirstname(String firstname) {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(String lastname) {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHourspay() {
        return hourspay;
    }

    public void setHourspay(double hourspay) {
        this.hourspay = hourspay;
    }

    public int getHoursaweek() {
        return hoursaweek;
    }

    public void setHoursaweek(int hoursaweek) {
        this.hoursaweek = hoursaweek;
    }
    public double getWeeklypay() {
        return weeklypay;
    }

    public void setWeeklypay(double weeklypay) {
        this.weeklypay = weeklypay;
    }

    public double getAnnualsalary() {
        return annualsalary;
    }

    public void setAnnualsalary(double annualsalary) {
        this.annualsalary = annualsalary;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", hourspay=" + hourspay +
                ", hoursaweek=" + hoursaweek +
                '}';
    }


//    public double annualsalary() {
//        double x = 0.0;
//        x = hourspay * hoursaweek * 240;
//        return annualsalary;
//
//    }

    public double getannualsalary(double v) {
        double x = 0.0;
        double overtime =0;
        52*40*hourspay+(overtime *1.5*(hoursaweek-40) );
        return annualsalary;

    }
    public double gethourspay(double hourspay) {
        return this.hourspay;
    }

    public double gethoursaweek(int hoursaweek) {
    return this.hoursaweek;
    }

    public double getweeklypay(double weekpay) {
    return weeklypay;
    }

    public double gethourspay() {
   return hourspay;
    }
}
