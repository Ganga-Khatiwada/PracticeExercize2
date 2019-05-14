import java.util.Scanner;
public class Five
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("The number is :"+isEven(num));
    }
    public static boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
}