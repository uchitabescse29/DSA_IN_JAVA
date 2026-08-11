package IF_ELSE;

import java.util.Scanner;

public class ternaryinvariables {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int uchit=(x>=0)?100:0;
        System.out.println(uchit);
    }
}
