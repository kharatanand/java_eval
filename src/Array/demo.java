package Array;
public class demo{
	
	public static void main(String[] args) {
		int []a= new int [3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("--------------------------------------------");
		
		int []b= {1,2,3,4,5,6,7,8,9,0};
		for (int i=0;i<=9;i++) {
			System.out.println(b[i]);	
		}
		System.out.println("--------------------------------------------");

		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println("--------------------------------------------");

		for(int j:b) {
			System.out.print(" "+j);
		}
		
	}
}