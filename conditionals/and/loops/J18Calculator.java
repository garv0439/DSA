package conditionals.and.loops;

import java.util.Scanner;

public class J18Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n1,n2,op;
		
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		
		System.out.println("Enter Option");
		op=sc.nextInt();
		
		if(op==1) {
			System.out.println("Enter number 1=>");
			n1=sc.nextInt();
			
			System.out.println("Enter number 2=>");
			n2=sc.nextInt();
			
			System.out.println("Addition of " + n1 + " + " + n2 + " is " +(n1+n2));
		}
		if(op==2) {
			System.out.println("Enter number 1=>");
			n1=sc.nextInt();
			
			System.out.println("Enter number 2=>");
			n2=sc.nextInt();
			
			System.out.println("Subtraction of " + n1 + " - " + n2 + " is " +(n1-n2));
		}
	
		if(op==3) {
			System.out.println("Enter number 1=>");
			n1=sc.nextInt();
			
			System.out.println("Enter number 2=>");
			n2=sc.nextInt();
			
			System.out.println("Multiplication of " + n1 + " x " + n2 + " is " +(n1*n2));
		}
		if(op==4) {
			System.out.println("Enter number 1=>");
			n1=sc.nextInt();
			
			System.out.println("Enter number 2=>");
			n2=sc.nextInt();
			
			System.out.println("Division of " + n1 + " / " + n2 + " is " +(n1/n2));
		}
	}

}
