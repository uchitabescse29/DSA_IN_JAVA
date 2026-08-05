package JAVA_BASICS;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        double n=sc.nextDouble();
        double square=n*n;
        System.out.println("Square is: ");
        System.out.println(square);
        sc.close();
    }
    
}
