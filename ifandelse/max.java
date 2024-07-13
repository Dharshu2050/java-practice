package ifandelse;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        // Write a program to find maximum between two numbers
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("max num" +num1);
        }
        else{
            System.out.println("max num is" +num2);
        }
    }
}
