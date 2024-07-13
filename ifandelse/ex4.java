package ifandelse;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your scholarship :");
        int scholarship=sc.nextInt();
        if(scholarship>7000){
           System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
