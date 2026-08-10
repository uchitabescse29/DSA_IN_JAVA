package IF_ELSE;
import java.util.*;
public class ifelseif6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x=sc.nextDouble();
        if(x%5==0&&x%3==0){
            System.out.println("number is divisible by 5&3 both");
        }
        else if(x%5==0){
            System.out.println("number is divisible by 5");
        }else if(x%3==0){
            System.out.println("number is divisible by 3");

        }
        else{
            System.out.println("number is not divisible by 5 or 3");
        }
        
    }
    
}
