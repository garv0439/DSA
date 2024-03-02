package conditionals.and.loops;

import java.util.Scanner;

public class J11Loops {

	public static void main(String[] args) {
		
		/*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement) {
            // body
        }
    */

    // Q: Print numbers from 1 to 5 =>
		
//    for (int num = 1; num <= 5; num += 1) {
//        System.out.println(num);
//    }
    
    //Q:  print numbers from 1 to n
//    Scanner in = new Scanner(System.in);
//    System.out.print("Please enter a number for loop: ");
//    int n = in.nextInt();
//
//    for (int num = 1; num <= n; num++) {
//        System.out.print(num + " ");
//    }
    
		
		
		 // while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

//		int num  = 1;
//        while (num <= 8) {
//            System.out.println(num);
//            num += 1;
//        }
		
        
     // do while
        /*

            do {
                // body
            } while (condition);

         */
		int n = 1;
        do {
          System.out.println(n);
        	n++;
        } while (n <= 5);

		
		
//        int n = 1;
//        do {
//            System.out.println("Hello World");
//        } while (n != 1);

    }
}