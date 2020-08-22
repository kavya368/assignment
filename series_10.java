import java.util.*;
class series_10
{
    int n,a,f;
    double ans;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n and then a");
        n=sc.nextInt();
        a=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=n;i+=3)
        {
            ans=i/Math.pow(a,i+1);
        }
        System.out.println(ans);
    }
   
    public static void main()
    {
        series_10 obj=new series_10();
        obj.accept();
        obj.calc();
       
    }
}
        
        
            
        