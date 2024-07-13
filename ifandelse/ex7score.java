package ifandelse;

import java.util.Scanner;

public class ex7score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //less than 50 -you need to improve
        //between 50 and 70 -good job 
        //greater than 70- excellent

        System.out.println("enter your score:");
        int score=sc.nextInt();
        if(score<50){
            System.out.println("you need to improve");
        }
        else if(score>=50 && score<=70){
             System.out.println("good job");
        }
        else if(score>=70){
            System.out.println("excellent");
        }
    }
}
