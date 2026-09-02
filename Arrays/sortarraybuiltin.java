package Arrays;
import java.util.*;
public class sortarraybuiltin {
    public static void main(String[] args) {
        //sort-ascending order
        int []arr={10,89,63,78,54};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[]arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
