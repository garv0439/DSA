package conditionals.and.loops;

import java.util.Scanner;

public class J12largestamong3 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();

	        // Q: Find the largest of the 3 numbers=>
	        
//	        int max = a;
//	        if (b > max) {
//	            max = b;
//	        }
//	        if (c > max) {
//	            max = c;
//	        }
	        
	        
//another method
	        
//	        int max = 0;
//	        if (a > b) {
//	            max = a;
//	        } else {
//	            max = b;
//	        }
//	        if (c > max) {
//	            max = c;
//	        }

	        
	        //another method
	        int max = Math.max(c, Math.max(a, b));

	        System.out.println(max);
	    }
	}