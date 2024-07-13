package variablesanddatatypes;

import java.util.Scanner;

public class inches {
    public static void main(String[] args) {
        /*  Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter*/
          Scanner sc=new Scanner(System.in);
          double inch=sc.nextDouble();
          double meter=inch*0.0254;
          System.out.println(inch+ " inch is " + meter + " meters ");


    }
}
