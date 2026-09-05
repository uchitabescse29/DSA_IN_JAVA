package Arrays;

public class Linearsearch2 {
    public static void main(String[] args) {
       int[]arr={12,89,90,56,78};
        int target=0;
        int  found=-1; //false means target array ma nhi hai 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
            
                found=i;//any no. except -1 means target array ma haii
              break;
            }
        }
        if(found!=-1){
            System.out.println("number exist at:"+found);
         } else{

           
       
            System.out.println("number do not exist");
        } 
    }
    
}
