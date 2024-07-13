package ifandelse;

import java.util.Scanner;

public class oddndeven {
    public static void main(String[] args) {
        //. Write a program to check whether a number is even or odd
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num %2==0 ){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }
}
