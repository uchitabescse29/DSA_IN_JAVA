package JAVA_BASICS;

import java.util.Scanner;

public class sum {
     public static void main(String[] args) {
       Scanner uchit=new Scanner(System.in);
       
       
       double a=uchit.nextDouble(); 
       double b=uchit.nextDouble(); 
       double c=uchit.nextDouble(); 
       double sum=a+b+c;

       System.out.println(sum);
       uchit.close();
    }
}
