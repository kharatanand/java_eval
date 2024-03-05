package Control_statement;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter marks here");
		int a = marks.nextInt();
		if (a<50 && a>=0)
		{
			System.out.println("Fail");
		}
		else if(a>=80 && a<=100)
			System.out.println("Grade A");
		else if (a>=70 && a<80)
				System.out.println("Grade B");
		else if (a>=60 && a<70)
				System.out.println("Grade C");
		else if (a>=50 && a<60)
				System.out.println("Grade D");
		else
				System.out.println("Invalid input");
	}
		
}
