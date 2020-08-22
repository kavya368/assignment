import java.util.*;
class series_4
{
    int n;
    int s=0;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s-i;
            }
            else 
            {
                s=s+i;
            }
           
        }
         System.out.println(s);
    }
    public static void main()
    {
        series_4 obj=new series_4();
        obj.getData();
        obj.calc();
    }
}
    

             
   
        