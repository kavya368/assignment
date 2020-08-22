import java.util.*;
class palindrome
{
    int n;
    void calc()
    
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
        int dig,rev=0,m;
        m=n;
        
        while(n>0)
        {
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(m==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    
     }
     public static void main()
     {
         palindrome obj=new palindrome();
         obj.calc();
        }
    }
     
        