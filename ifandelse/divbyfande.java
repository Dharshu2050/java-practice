package ifandelse;

import java.util.Scanner;

public class divbyfande {
          public static void main(String[] args) {
            // Write a program to check whether a number is divisible by 5 and 11 or not
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num%5==0 && num%11==0){
                System.out.println("divi by 5 nd 11");
            }
            else{
                System.out.println("not divi by 5 nd 11");
            }
        }
    
}