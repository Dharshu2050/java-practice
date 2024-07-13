package variablesanddatatypes;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //BMI body mass index -weight height correct irukanu check panra oru function
        //Write a Java program to compute the body mass index (BMI).

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your weight:" );
        double weight_pounds=sc.nextDouble();
        System.out.println("enter your height:");
        double height_inches=sc.nextDouble();
        //convert weight from pounds into kilograms
        double weight_kilograms=weight_pounds *0.45359237;
        //convert height form inches into meters
        double height_meters=height_inches*0.0254;

        double bmi=weight_kilograms/(height_meters*height_meters);

        System.out.println("BMI is " + bmi);
    }
}
