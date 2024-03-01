package demos;

import java.util.Scanner;

public class J4inputs {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please enter some input: ");
		 
		 int rollno = input.nextInt();
		 System.out.println("Your roll number is " + rollno);
		 
		 Scanner input2 = new Scanner(System.in);
		 System.out.print("Please enter Your name: ");
		 
         String name = input2.nextLine();
         System.out.println("Your name is " + name);

//         float marks = input.nextFloat();
//         System.out.println(marks);
	}

}
