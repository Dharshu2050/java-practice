package variablesanddatatypes;

import java.util.Scanner;

public class nameandage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String address=sc.nextLine();
        System.out.println("my name is " +name);
        System.out.println("my age is " +age);
        System.out.println("address is " +address);
    }
}
