package org.scanner;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("enter StudentId:");
		byte StudentId=s.nextByte();
	    System.out.println("enter StudentName:");
	    String StudentName=s.next();
	    String StudentName1=s.nextLine();
	    System.out.println("enter StudentEmail:");
	    String StudentEmail=s.next();
	    System.out.println("enter StudentPhoneno:");
	    long StudentPhoneno=s.nextLong();
	    System.out.println("enter StudentDept:");
	    String StudentDept=s.next();
	    System.out.println("enter StudentGender:");
	    String StudentGender=s.next();
	    System.out.println("enter StudentCity:");
	    String StudentCity =s.next();
	    
	    System.out.println("----------------------------------");
	    System.out.println("StudentId:"+StudentId);
	    System.out.println("StudentName:"+StudentName+""+StudentName1);
	    System.out.println("StudentEmail:"+StudentEmail);
	    System.out.println("StudentPhoneno:"+StudentPhoneno);
	    System.out.println("StudentDept:"+StudentDept);
	    System.out.println("StudentGender:"+StudentGender);
	    System.out.println("StudentCity:"+StudentCity);
	    System.out.println("----------------------------------");
	s.close();
	}
	}


