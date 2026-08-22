package arguments;

public class returntype1 {
    public static int uchit(int a){
        System.out.println("yuvank");
        if(a>0){
            return 5;  //khatam
        }else{
            return 10;
        }
    }
    public static void main(String[] args) {
        int x=uchit(3);
        System.out.println(3+x);
    }
    //uchit()--->stand alone call lagagyi bas
}
