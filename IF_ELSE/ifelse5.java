package IF_ELSE;
import java.util.Scanner;
public class ifelse5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("profit is:" +(sp-cp));
        }else if(sp==cp){
            System.out.println("no profit & no loss");
        }else{
            System.out.println("loss is:"
                +(cp-sp));
            
        }


    }
    
}
