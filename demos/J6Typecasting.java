package demos;

import java.util.Scanner;

public class J6Typecasting {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1\
//        System.out.println(b);

//        byte w = 40;
//        byte x = 50;
//        byte y = 100;
//        int z = w * x / y;
//
//        System.out.println(z);


//        int number = 'A';
//        System.out.println("नमस्ते");

//        System.out.println(3 * 6);

//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        
//        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
//        System.out.println(result);
    }
}