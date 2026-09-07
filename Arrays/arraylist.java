package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(25);
        arr.add(4);
        arr.add(46);
        arr.add(14);
        arr.add(18);
        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr.get(3));
        System.out.println(arr);
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i)+ " ");
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        arr.add(78);
        System.out.println(arr);
        arr.add(1,90);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
       
        System.out.println(arr);
        

    }
}