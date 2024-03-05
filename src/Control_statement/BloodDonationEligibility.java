package Control_statement;

import java.util.Scanner;

public class BloodDonationEligibility {
public static void main(String[] args) {
	Scanner age = new Scanner(System.in);
	Scanner weight = new Scanner(System.in);
	
	System.out.println("Please enter your age");
	int age1 = age.nextInt();
	if (age1>18) {
		System.out.println("Please enter your weight");
		int w = weight.nextInt();
		if (w>=60) {
			System.out.println("You are eligible for blood donation");
		}
		else System.out.println("You are not eligible due to less weight");
	}
	else System.out.println("You not eligible because of less age");
	}
}
