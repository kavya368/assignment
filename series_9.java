import java.util.*;
class series_9
{
    int n;
    int s=0;
   
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            s=s+i/1;
        }
        System.out.println(s);
    }
    public static void main()
    {
        series_9 obj=new series_9();
        obj.accept();
        obj.calc();
    }
}
        
        
            
            