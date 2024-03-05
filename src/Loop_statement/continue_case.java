package Loop_statement;

public class continue_case {
	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			if (i==0 || i==5 || i==10) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
