package ifandelse;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //get i/p for variable mark .if mark >35 print pass else print fail.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mark :");
        int mark=sc.nextInt();

        if(mark>35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
