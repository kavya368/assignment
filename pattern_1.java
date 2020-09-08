import java.util.*;  // 1 11 111
class pattern_1
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
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+1);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern_1 obj=new pattern_1();
        obj.getData();
        obj.generatePattern();
    }
}
            
           
            
        