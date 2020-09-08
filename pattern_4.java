import java.util.*;  // 1 23 456 78910
class pattern_4
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
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(""+count);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern_4 obj=new pattern_4();
        obj.getData();
        obj.generatePattern();
    }
}
            
           
            
        