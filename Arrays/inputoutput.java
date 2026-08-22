package Arrays;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //    int [] arr={5,-8,2,67,43,-97};
        //    System.out.println(arr.length);
        //    int n=arr.length; //index---0 to n-1
        //    for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //    }


        int [] uchit=new int[7];
        // // default values
        // for(int i=0;i<uchit.length;i++){
        //     System.out.print(uchit[i]+" ");
        // }
        // input in array
         for(int i=0;i<uchit.length;i++){
            uchit[i]=sc.nextInt();
           

        }
        // print

        for(int i=0;i<uchit.length;i++){
            System.out.print(2*uchit[i]+" ");
        }

        
    }
}
