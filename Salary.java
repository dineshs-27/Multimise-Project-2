package PaySlip;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        BufferedReader getInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name : ");
        String name = getInput.readLine();
        System.out.println("Employment types : Regular Employee [RE], Daily Wages [DW], Consolidated [CON]");
        System.out.println("Enter the Employment type : ");
        String Emp = getInput.readLine();
        switch(Emp) {
            case "RE" -> {
                System.out.println("Enter the Basic salary : ");
                int BS1 = Input.nextInt();
                int HRA1 = (BS1 / 100) * 12;
                int DA1 = (BS1 / 100) * 18;
                int Total1 = BS1 + HRA1 + DA1;
                System.out.println("Name : " + name);
                System.out.println("Employment type : " + Emp);
                System.out.println("Net Salary : " + "\n  The basic salary is " + BS1 + "\n  House Rent Allowance [HRA] is " + HRA1 + "\n  Dearness Allowance [DA] is " + DA1 + "\n  Total salary = " + Total1);
            }
            case "DW" -> {
                System.out.println("Employee is paid 800 per hour");
                System.out.println("Enter the number of hours worked: ");
                int hours = Input.nextInt();
                int BS2 = hours * 800;
                int HRA2 = 2000;
                int DA2 = (BS2 / 100) * 18;
                int Total2 = BS2 + HRA2 + DA2;
                System.out.println("Name : " + name);
                System.out.println("Employment type : " + Emp);
                System.out.println("Net Salary : " + "\n  The basic salary is " + BS2 + "\n  House Rent Allowance [HRA] is fixed " + HRA2 + "\n  Dearness Allowance [DA] is " + DA2 + "\n  Total salary = " + Total2);
            }
            case "CON" -> {
                System.out.println("The Employee is paid 10000 as basic salary");
                int BS3 = 10000;
                int HRA3 = 2000;
                int DA3 = (BS3 / 100) * 18;
                int Total3 = BS3 + HRA3 + DA3;
                System.out.println("Name : " + name);
                System.out.println("Employment type : " + Emp);
                System.out.println("Net Salary :" + "\n  The basic salary is 10000 \n  House Rent Allowance [HRA] is fixed " + HRA3 + "\n  Dearness Allowance [DA] is " + DA3 + "\n  Total salary = " + Total3);
            }
            default -> System.out.println("Wrong Input !");
        }
    }
}