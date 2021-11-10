/*QUESTION 2:
-------------
Description: Using Scanner class get the below details
             studentId
             studentName
             Mark1
             Mark2
             Mark3
             Mark4
             Mark5
Find the total and average of marks*/
package org.scanner;
import java.util.Scanner;

public class Scanner2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter studentId :");
	byte Id=sc.nextByte();
	System.out.println("enter studentName :");
	String Name=sc.next();
	String Name1=sc.nextLine();
	System.out.println("enter Mark1 :");
	int m1=sc.nextInt();
	System.out.println("enter Mark2 :");
	int m2=sc.nextInt();
	System.out.println("enter Mark3 :");
	int m3=sc.nextInt();
	System.out.println("enter Mark4 :");
	int m4=sc.nextInt();
	System.out.println("enter Mark5 :");
	int m5=sc.nextInt();
	
	System.out.println("---------------------------------");
    System.out.println("studentId : "+Id);
    System.out.println("studentName : "+Name+""+Name1);
    System.out.println("Mark1 : "+m1);
    System.out.println("Mark2 : "+m2);
    System.out.println("Mark3 : "+m3);
    System.out.println("Mark4 : "+m4);
    System.out.println("Mark5 : "+m5);
    int Total=m1+m2+m3+m4+m5;
    System.out.println("Total of marks : "+Total);
    int Avg=Total/5;
    System.out.println("Average of marks : "+Avg);
    System.out.println("----------------------------------");
    sc.close();
}
}
