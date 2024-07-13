package ifandelse;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rcb is win or loose:");
        String rcb=sc.nextLine();
        
        if (rcb.equals("win")) {
            System.err.println("win cup");
        } else {
            System.out.println("sad moments");
        }
    }
    
}
