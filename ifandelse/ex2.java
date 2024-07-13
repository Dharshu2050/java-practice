package ifandelse;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("megana is dead or not:");
        String megana=sc.nextLine();
        if(megana.equals("dead")){
            System.out.println("priya meets suriya");
        }
        else{
            System.out.println("suriya weds megana");
        }
    }
}
