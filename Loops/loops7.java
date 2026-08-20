package Loops;

import java.util.Scanner;

public class loops7 {
    public static void main(String[] args) {
        //WAP to print if number is composite or not
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                System.out.println("composite number");
                break;
            }
            sc.close();
        }
    }
}
