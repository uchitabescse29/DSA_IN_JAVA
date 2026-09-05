package Arrays;

public class min {
    public static void main(String[] args) {
        int []arr={1,9,0,3,7};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
