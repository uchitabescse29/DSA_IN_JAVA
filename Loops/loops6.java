package Loops;

import java.util.Scanner;

public class loops6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //A.P 2,5,8,11,14.....
        for(int i=2;i<3*n-1;i+=3){
            System.out.println(i);
        }


        
    }
    
}
