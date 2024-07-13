package ifandelse;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int divisble=sc.nextInt();
        int c=divisble/3;
        if(divisble%3==0 && divisble%5==0){
            System.out.println("divisible by 3 and 5");
        }
        else{
            System.out.println("not divisible by 3 and 5");
        }
    }
}
