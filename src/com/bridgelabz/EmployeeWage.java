package com.bridgelabz;

import java.io.FilterOutputStream;

public class EmployeeWage {
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static int computeEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int maxWorkingHoursPerMonth) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalWorkingDays < workingDaysPerMonth && totalEmpHrs <=maxWorkingHoursPerMonth) {
            totalWorkingDays++;

            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("employeeCheck");
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
        int totalWage=totalEmpHrs*wagePerHour;
        System.out.println("Total Employee Wage for a company "+companyName+" = " + totalWage);
        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage ");
        computeEmployeeWage("Amazon",10,4,10);
        computeEmployeeWage("Airtel", 10,4,10);
    }
}