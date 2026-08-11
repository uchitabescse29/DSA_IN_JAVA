package IF_ELSE;

import java.util.Scanner;

public class ternaryoperator1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        // condition?sach:jhoot
        System.out.println(x+" "+((x%2==0 ) ?"even":"odd"));
    }
}
