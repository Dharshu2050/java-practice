package variablesanddatatypes;

import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double score=sc.nextDouble();
        sc.nextLine();
        String department=sc.nextLine();
        double score2=score/10;
        System.out.println("enter yr name:" +name);
        System.out.println("enter your score: " +score2 +"/10");
        System.out.println("enter your department :" +department);
    }
}
