package ifandelse;

import java.util.Scanner;

public class ex7subject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int mark=m1+m2+m3+m4+m5;
        int avg=mark/5;
        if(avg<35){
            System.out.println("improve");
        }
        else{
            System.out.println("good");
        }
    }
}
