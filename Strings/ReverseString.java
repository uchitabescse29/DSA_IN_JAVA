package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s="Aditya";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
    
}
