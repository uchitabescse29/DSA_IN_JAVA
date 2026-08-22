package Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int products=1;
        for(int i=0;i<n;i++){
            products*=arr[i];
           

        }
        System.out.println(products);
    }
}
