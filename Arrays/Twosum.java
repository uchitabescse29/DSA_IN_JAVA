package Arrays;

public class Twosum {
    public static void main(String[] args) {
        System.out.println("Two sum");
    }
       public static boolean twosum(int arr[],int target){
        int n=arr.length;  
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

