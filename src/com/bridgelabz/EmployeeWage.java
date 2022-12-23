package com.bridgelabz;

public class EmployeeWage
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage ");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        int dailyWage=0;
        if (employeeCheck == 1) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage of employee is " + dailyWage);
    }
}
