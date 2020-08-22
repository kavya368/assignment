import java.util.*;
class series_7
{
    double n;
    double s=0;
    double s1=0;
    double k;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextDouble();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            s1=s*i;
            s1=k*1;
            System.out.println(s1);
        }
    }
    public static void main()
    {
        series_7 obj=new series_7();
        obj.getData();
        obj.calc();
    }
}
            