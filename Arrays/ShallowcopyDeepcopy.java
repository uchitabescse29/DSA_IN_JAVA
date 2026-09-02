package Arrays;
import java.util.Arrays;
public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
        int[]arr={12,12,45,67};
        // int[]x=arr;  //x is shallow copy of arr
        // arr[0]=100;
        // System.out.println(arr[0]);

        int[]deep=Arrays.copyOf(arr,arr.length);//deepcopy
        deep[0]=100;
        System.out.println(arr[0]);
      }
    
}
