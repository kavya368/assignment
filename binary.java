import java.util.*;
class binary 
{
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        double binary,decimal=0,i=0;
        binary=n;
        while(n>0)
        {
            int d=n%10;
            decimal=decimal+d*Math.pow(2,i);
            n=n/10;
            ++i;
        }
        System.out.println(binary);
        System.out.println(decimal);
     }
     public static void main()
    {
        binary obj=new binary();
        obj.input();
    }
}
      
