import java.util.*;  // A BB CC DDD
class pattern_6
{
    int n;

    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void generatePattern()
    {    
        char ch=64;
        for(int i=1;i<=n;i++)
        {
            ch++;
            if(i%2!=0)
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                
            }
            else
            for(int j=1;j<=i;j++)
            
            System.out.print(""+Character.toLowerCase(ch));
        }
    }
    public static void main()
    {
        pattern_3 obj=new pattern_3();
        obj.getData();
        obj.generatePattern();
    }
}
            
           
            
        