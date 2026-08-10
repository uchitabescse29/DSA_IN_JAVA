package IF_ELSE;
 import java.util.Scanner;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n=sc.nextDouble();
        int x=(int)n;
        if(n-x>0){
            System.out.println("not an integer");
        }else{
            System.out.println("is an integer");
        }

    }
    
}
