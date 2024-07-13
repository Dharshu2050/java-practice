package variablesanddatatypes;

import java.util.Scanner;

import basic.c;

public class degree {
    public static void main(String[] args) {
        /*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
        double fahrenheit=212;
        System.out.println(fahrenheit/1  +"degree fahrenheit is equal to 100.0 in celsius");*/

        Scanner sc=new Scanner(System.in);
        double fahrenheit=sc.nextDouble();
        //formula for convert temperature to celsius
        // c/5=f-32/9  c=5(f-32)/9  f=(9c+(32*5))/5
         double celsius=((5*(fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit+ " degree fahrenheit is equal to " + celsius +" in celsius ");
    }
}
