package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Uchit");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.append("Taliyan");
        System.out.println(sb);
        sb.setCharAt(1,'o');
        System.out.println(sb);
        
    }
    
}
