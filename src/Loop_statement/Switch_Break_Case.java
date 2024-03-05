package Loop_statement;

import java.util.Scanner;

public class Switch_Break_Case {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number");
		int a = in.nextInt();
		
		switch (a) {
		case 1: System.out.println("This is Jan"); break;
		case 2: System.out.println("This is Feb"); break;
		case 3: System.out.println("This is March"); break;
		case 4: System.out.println("This is Apr"); break;
		case 5: System.out.println("This is May"); break;
		case 6: System.out.println("This is June"); break;
		case 7: System.out.println("This is July"); break;
		case 8: System.out.println("This is Aug"); break;
		case 9: System.out.println("This is Sept"); break;
		case 10: System.out.println("This is Oct"); break;
		case 11: System.out.println("This is Nov"); break;
		case 12: System.out.println("This is Dec"); break;
		default: 
		 System.out.println("This is invalid month input");
	
	}
	}
}
