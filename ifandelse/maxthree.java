package ifandelse;

import java.util.Scanner;

public class maxthree {
    public static void main(String[] args) {
        //Write a program to find maximum between three numbers
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1 >num2 && num1 >num3){
            System.out.println("max num is" +num1);
        }
        else if(num1<num2 && num2<num3){
            System.out.println("max num is " +num2);
        }
        else {
            System.out.println("max num is" +num3);
        }
    }
}
