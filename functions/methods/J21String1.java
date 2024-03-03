package functions.methods;

import java.util.Scanner;

public class J21String1 {

    public static void main(String[] args) {
    	
    	Scanner in  = new Scanner(System.in);
    	
    	
      String message = greet();
      System.out.println(message);

      
      
      System.out.print("Enter your name: ");
      String name1 = in.next();
      String x = myGreet(name1);
      System.out.println(x);
  }

  static String myGreet(String name) {
      String message = "Hello " + name;
      return message;
  }


  static String greet() {
      String greeting = "how are you";
      return greeting;
  }
}