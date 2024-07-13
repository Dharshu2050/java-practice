package ifandelse;

import java.util.Scanner;

public class ex6evennum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //number is even or odd

        System.out.println("enter the number");
        int number=sc.nextInt();
        if(number% 2==0 || number % 3==1){
           System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
