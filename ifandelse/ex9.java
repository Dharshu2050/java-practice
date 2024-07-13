package ifandelse;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter color(red, green,yellow):");
        String color=sc.nextLine();
        if(color.equals("red")){
           System.out.println("stop");
        }
        else if(color.equals("green")){
            System.out.println("go");
        }
        else if(color.equals("yellow")){
            System.out.println("wait");
        }
    }
}
