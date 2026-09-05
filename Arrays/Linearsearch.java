package Arrays;

public class Linearsearch {
    public static void main(String[] args) {
        int[]arr={12,89,90,56,78};
        int target=78;
        boolean found=false; //false means target array ma nhi hai 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
            System.out.println("number exist at:"+i);

                found=true;//true means target array ma haii
              break;
            }
        }
        if(!found){
           
       
            System.out.println("number do not exist");
        }
    }
}
