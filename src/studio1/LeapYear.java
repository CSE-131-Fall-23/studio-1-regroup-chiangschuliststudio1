package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		
		double year = in.nextInt();
		
		boolean leap = ((year / 4) % 1 == 0) && !((year / 100) % 1 == 0) || ((year / 400) % 1 == 0);
		
		System.out.println(leap);
	}

}
