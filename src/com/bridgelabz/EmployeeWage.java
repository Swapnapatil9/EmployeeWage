package com.bridgelabz;

import java.io.FilterOutputStream;

public class EmployeeWage
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS_PER_MONTH = 100;
    static void employeeWage(){
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("employeeCheck");
        int totalWage = 0;
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;;
        while(totalWorkingDays < WORKING_DAYS_PER_MONTH && totalEmpHrs <=MAX_WORKING_HOURS_PER_MONTH) {
            totalWorkingDays++;

            switch (employeeCheck) {
                case IS_FULL_TIME:
                    empHrs= FULL_DAY_HOUR;
                    System.out.println("Employee is Full-time");
                    break;
                case IS_PART_TIME:
                    empHrs= PART_TIME_HOUR;
                    System.out.println("Employee is Part-time");
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalEmpHrs+=empHrs;
            System.out.println("Day:"+totalWorkingDays+" Emp hr="+empHrs+"");

        }
        totalWage=totalEmpHrs*WAGE_PER_HOUR;
        System.out.println("Total Employee Wage = " + totalWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage ");
        employeeWage();
    }
}
