import java.util.*;
class series_5
{
    int n;
    int ans;
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
            ans=i*i+1;
           System.out.print(ans+" , ");
        }
        
    }
    public static void main()
    {
        series_5 obj=new series_5();
        obj.getData();
        obj.calc();
    }
}
    
        
    

        


 
