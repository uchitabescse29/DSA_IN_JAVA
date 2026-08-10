package IF_ELSE;
import java.util.*;
public class ifelseif7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        if((x+y>z)&&(y+z>x)&&(x+z>y)){
            System.out.println("all three are sides of triangle");
        }else{
            System.out.println("Not a triangle");
        }

    }
    
}
