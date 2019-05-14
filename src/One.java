import java.util.Scanner;
public class One{
    public static void palindrome(String s){
        String reverse="";
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            reverse=reverse + s.charAt(i);
        }
        System.out.println("the reversed input is " +reverse);
        if(reverse.equals(s))
            System.out.println("palindrome: yes");
        else
            System.out.println("palindrome: no");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input is required:");
        String str=sc.nextLine();
        palindrome(str);
    }
}