/*QUESTION 1:
------------
Description: Using Scanner class get the below details
             empId
             empName
             empEmail
             empPhoneno
             empSalary
             empGender
             empCity */
package org.scanner;

import java.util.Scanner;

public class Scanner1 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("enter empId:");
	byte empId=s.nextByte();
    System.out.println("enter empName:");
    String empName=s.next();
    System.out.println("enter empEmail:");
    String empEmail=s.next();
    System.out.println("enter empPhoneno:");
    long empPhoneno=s.nextLong();
    System.out.println("enter empSalary:");
    double empSalary=s.nextDouble();
    System.out.println("enter empGender:");
    String empGender=s.next();
    System.out.println("enter empCity:");
    String empCity =s.next();
    
    System.out.println("-------------------------------------");
    System.out.println("empId:"+empId);
    System.out.println("empName:"+empName);
    System.out.println("empEmail:"+empEmail);
    System.out.println("empPhoneno:"+empPhoneno);
    System.out.println("empSalary:"+empSalary);
    System.out.println("empGender:"+empGender);
    System.out.println("empCity:"+empCity);
    System.out.println("-------------------------------------");
    s.close();
}
}
