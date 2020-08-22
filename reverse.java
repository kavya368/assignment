import java.util.*;
class reverse
{
    int n;
    int rev=0;
   void accept()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value");
       n=sc.nextInt();
    }
   void calc()
    {
         while(n != 0)
         {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + rev);
    }
   public static void main()
    {
        reverse obj=new reverse();
        obj.accept();
        obj.calc();
    }
}
    
   