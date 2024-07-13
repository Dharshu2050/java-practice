package ifandelse;

import java.util.Scanner;

import basic.a;

public class alphabet {
    public static void main(String[] args) {
        //Write a program to check whether a character is alphabet or not
         Scanner sc=new Scanner(System.in);
        char latter=sc.next().charAt(0);
        if(latter>='a' && latter<='z' || latter>='A' && latter<='Z'){
            System.out.println("this is alphbet");
        }
        else{
            System.out.println("this not alphabet");
        }
    }
}
