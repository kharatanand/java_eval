package Control_statement;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give input here");
		
		int a= input.nextInt();
		if (a%2==0)
		{
			System.out.println("The number is Even");
		}
		else
			System.out.println("The given number is Odd");
}
}
