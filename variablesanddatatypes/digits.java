package variablesanddatatypes;

import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        Scanner sc=new Scanner(System.in);
        System.out.println("input an inter between 0 to 1000:");
        int num=sc.nextInt();
        
        int digits=(num%10)+ ((num/10)%10)+(num /100);
        System.out.println("sum of the digits:" +digits); 
    }
}
