package MathMethods;

import java.util.Scanner;

public class MathMethods {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x = scnr.nextDouble();
      double y = scnr.nextDouble();
      double z = scnr.nextDouble();

      double input1 = Math.pow(x, z);
      double input2 = Math.pow(x, Math.pow(y, z)); 
      double input3 = Math.abs(y);
      double sqrtValue = Math.pow(x * y, z);
      double input4 = Math.sqrt(sqrtValue);
      System.out.println(input1);
      System.out.println(input2);
      System.out.println(input3);
      System.out.println(input4);
      System.out.println(sqrtValue);
      scnr.close();
   }
}
