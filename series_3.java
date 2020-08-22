import java.util.*;
class series_3
{
    int n;
    int s=0;
    int s1=0;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=0;i<=n;i++)
        {
            s=s+i;
            s1=s1+s;
            System.out.print(s1+",");
        }
        
    }
    public static void main()
    {
        series_3 obj=new series_3();
        obj.getData();
        obj.calc();
    }
}

        
        