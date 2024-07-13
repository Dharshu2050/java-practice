package ifandelse;

public class stringcompare {
    public static void main(String[] args) {
        String a="dharshu";
        String b="dharshu";
        //== will check that a and b's address 
       if (a==b) {
        System.out.println("yes equal");
       }
       else{
        System.out.println("not equal");
       }

       //eqauls() function will check that content of the a and b 
        
        if (a.equals(b)) {
            System.out.println("yes equal");
           }
           else{
            System.out.println("not equal");
           }
       //string object create

       String k=new String("apple");
       String d=new String("apple");

        
        if (k==d) {
            System.out.println("yes equal");
           }
           else{
            System.out.println("not equal");
           }

        
       if (k.equals(d)) {
        System.out.println("yes equal");
       }
       else{
        System.out.println("not equal");
       }

       String r=new String("apple");
       String s="dharshu";
        if (r==s) {
            System.out.println("yes equal");
           }
           else{
            System.out.println("not equal");
           }
    }
}
