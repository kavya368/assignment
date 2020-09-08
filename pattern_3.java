import java.util.*;  // 1 12 123 1234
class pattern_3
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
                System.out.print(""+j);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern_3 obj=new pattern_3();
        obj.getData();
        obj.generatePattern();
    }
}
            
           
            
        