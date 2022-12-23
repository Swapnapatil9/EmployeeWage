package com.bridgelabz;

public class EmployeeWage
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage ");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(employeeCheck);
        int dayCount = 1;
        int totalWage = 0;
        while(dayCount <= WORKING_DAYS_PER_MONTH) {
            int dailyWage = 0;
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee is Full-time");
                    break;
                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part-time");
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalWage+=dailyWage; // totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for  Day = " + dayCount + " is " + dailyWage);
            System.out.println("Total wage till Day = " + dayCount + " is " + totalWage);
            dayCount++;
        }
        System.out.println("Total Wage = " + totalWage);
    }
}
