import java.util.*;
class armstrong
{
     void recieve()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value");
       int n=sc.nextInt();
       
       int dig,rev=0,m;
        m=n;
        
        
        while(n>0)
        {
            dig=n%10;
            rev=rev*10+dig*dig*dig;
            n=n/10;
        }
        if(m==rev)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not a armstrong");
        }
    }
    public static void main()
    {
        armstrong obj=new armstrong();
        obj.recieve();
    }
}
    

        