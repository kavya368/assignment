import java.util.*;
class series_6
{
    int n;
    int fact=1;
    int s=0;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=2;i<=n;i+=2)
        {
            if(i%2==0)
            { 
                fact=fact*i;
                s=s-fact;
            }
            else 
            {
                fact=fact*i;
                s=s+fact;
            }
            System.out.println(s);
            
        
    }
}
    public static void main()
    {
        series_6 obj=new series_6();
        obj.getData();
        obj.calc();
    }
}

   
