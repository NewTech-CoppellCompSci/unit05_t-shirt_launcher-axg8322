package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.print("\nEnter another positive integer: ");
		int input2 = inKey.nextInt(); 
		if (input1>0 && input2>0) {
		int max = Math.max(input1,input2);
		int min = Math.min(input1,input2);
		for (int i=0; i<100; i++)
		{
		System.out.print((int)(Math.random() * (max-min+1))+min +" ");
			
		}
		}
		}
	

	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter the radius: ");
		double rad = inKey.nextDouble();
		System.out.print("Enter height: ");
		double height = inKey.nextDouble();
		double D = (Math.pow(rad,2)*height)* Math.PI;
	    System.out.println ("The volume of cylinder is = " +D);
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter X1: ");
		double X1 = inKey.nextDouble();
		System.out.print("Enter Y1: ");
		double Y1 = inKey.nextDouble();
		System.out.print("Enter X2: ");
		double X2 = inKey.nextDouble();
		System.out.print("Enter Y2: ");
		double Y2 = inKey.nextDouble();
		double D = Math.sqrt((Math.pow ((Y2-Y1),2) + Math.pow ((X2-X1),2))); 
		System.out.println ("Distance between points = " +D);
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		double f1 = Math.sqrt((Math.pow (b,2)-4*a*c));
	    double X1 = (-b+f1)/(2*a);
	    double X2 = (-b-f1)/(2*a);
	    System.out.println ("X1 = " +X1);
	    System.out.println ("X2 = " +X2);	
		
	}



}
