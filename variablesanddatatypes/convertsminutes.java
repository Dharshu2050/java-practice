package variablesanddatatypes;

import java.util.Scanner;

public class convertsminutes {
    public static void main(String[] args) {
        //Write a Java program to convert minutes into years and days.
        Scanner sc=new Scanner(System.in);
        
        //formala - mininyear minutes /(60 *24*365);  days - (minutes/60/24)%365

        System.out.println("number of minutes :");
        double min=sc.nextDouble();
        double mininyear=(60*24*365);
        long years=(long) (min/mininyear);
        int days =(int) (min/60/24)%365;

        System.out.println((int) min + " minutes is approximately " +years + " years and " + days +" days ");
    }
}
