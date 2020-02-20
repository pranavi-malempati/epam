package cc;

import java.io.*;
import java.util.Scanner;
public class consthouse extends materialcost{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Area of your House");
		int Area = scan.nextInt();
		materialcost(Area);
	}

}
