package cc;

import java.io.*;
import java.util.Scanner;
public class materialcost extends intrest{
	public static void materialcost(int Area)
	{    
		System.out.println("Requirement Credentials:\n 1.Super High Cost Material - 2500INR\n2. High Cost Material - 1800INR\n3.  Moderate Cost Material - 1500INR\n4.  Reasonable Low Cost Material - 1200INR ");
		int c;
		int k = 0;
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt(); 
		if(c == 1) k = Area * 2500;
		else if(c == 2)  k = Area * 1800;
		else if(c == 3)  k = Area * 1500;
		else if(c == 4)  k = Area * 1200;
		else System.out.println("Enter Validate Requirement Sequence No.");
		System.out.print("Total Construction Cost is : ");
		intrest2(k);
		System.out.print("INR");
	}
}
