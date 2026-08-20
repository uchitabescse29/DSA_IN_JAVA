package Methods;

import java.util.Scanner;

public class methods1 {
    public static void main(String[] args) {
        // math. wale
        //System.out.println( Math.sqrt(100));
        //System.out.println( Math.cbrt(100));
        //System.out.println( Math.abs(-45));
        //System.out.println( Math.floor(-7.8));
        //System.out.println( Math.ceil(3.0001));
        //System.out.println( Math.min(3,9));
        //System.out.println( Math.max(3,9));
       



        // SAWAAL - 3 number ka maximum kaise nikale
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));

        sc.close();
    }
}
