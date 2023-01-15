package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inKey = new Scanner(System.in);
		System.out.printf("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.printf("\nEnter another positive integer: ");
		int input2 = inKey.nextInt();
		double output = Math.pow(input1, input2);
		System.out.printf ("\n" +input1 + "^" +input2 +" = ");
	    System.out.println (output);
}
	
	
	
	public static void problem2() {
	Scanner inKey = new Scanner(System.in);
	System.out.printf("\nEnter a positive integer: ");
	int input = inKey.nextInt();
	double output = (Math.sqrt(input));
    System.out.printf ("\nThe square root of " +input +" is ");
    System.out.println (output);					
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.printf("\nLength of side A: ");
		int A = inKey.nextInt();
		System.out.printf("\nLength of side B: ");
		int B = inKey.nextInt();
		double H = Math.sqrt (Math.pow (A,2) + Math.pow (B,2));
	    System.out.println ("\nHypotenuse = " +H );
	}
	
	
	
	public static void problem4() {
		int Max = 0;
		int Min = 0;
		System.out.printf("\nEnter an integer: ");
		Scanner inKey = new Scanner(System.in);
		int N = inKey.nextInt();
		
		while (N != 0)  {
			if (Max < N) {
				Max = N;
				
			}
			
			if (Min > N) {
				Min = N;
			}
			System.out.printf("\nEnter an integer: ");
			//Scanner inKey = new Scanner(System.in);
			N = inKey.nextInt();
			}
			System.out.println("Max = " +Max);
			System.out.println("Min = " +Min);
		
			}
}

