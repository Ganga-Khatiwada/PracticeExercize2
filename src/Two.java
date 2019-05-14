import java.util.Scanner;
public class Two
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to check the power of 4");
            int num=sc.nextInt();
            System.out.println(pow4(num));
        }
        private static boolean pow4(int number)
        {
            if(number<=0)
            {
                return false;
            }
            while(number > 1)
            {
                if(number % 4 != 0)
                {
                    return false;
                }
                number = number / 4;
            }
            return true;
        }
}
