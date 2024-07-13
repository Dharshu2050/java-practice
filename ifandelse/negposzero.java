package ifandelse;

import java.util.Scanner;

public class negposzero {
    public static void main(String[] args) {
        //Write a program to check whether a number is negative, positive or zero
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num >0){
            System.out.println("positive");
        }
        else if(num <0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
