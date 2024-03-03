package functions.methods;

import java.util.Arrays;

public class J26VarArgs {


	public static void main(String[] args) {
      fun(5,6,7);
      multiple(2, 3, "omg");
//      demo(2,3,4);
      demo("Garv","rahul");
  }

  static void demo(int ...v) {
      System.out.println(Arrays.toString(v));
  }

  static void demo(String ...v) {
      System.out.println(Arrays.toString(v));
  }

  static void multiple(int a, int b, String ...v) {
	  System.out.println(Arrays.toString(v));
  }

  static void fun(int ...v) {
      System.out.println(Arrays.toString(v));
  }
}