import java.util.*;
class for_1
{
    int n, l;
    double s;
    void getData()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value");
         n=sc.nextInt();
        l=sc.nextInt();
    }
    void calc()
    {
        for(int i=0;i<=n;i++)
        {
             s=Math.pow(l,i);
        }
        System.out.println(s);
    }
    public static void main()
    {
        for_1 obj=new for_1();
        obj.getData();
        obj.calc();
    }
}
    
            
        

