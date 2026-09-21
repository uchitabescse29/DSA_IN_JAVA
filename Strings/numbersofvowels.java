package Strings;

public class numbersofvowels {
    public static void main(String[] args) {
       String s="aieouchityvsklsdmnfd";
       int count=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            count++;

       }
       System.out.println(count);
    }
}
