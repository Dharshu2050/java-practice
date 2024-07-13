package variablesanddatatypes;

import java.lang.System;
import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args) {
        //create scanner object
    Scanner sc=new Scanner(System.in);
   
    int a=sc.nextInt();
   
    System.out.println("enter value of a:" +a);
    int b=sc.nextInt();
    System.out.println("enter value of b:" +b);
  
    int c=a+b;
    System.out.println(c); 
    }
   
}
