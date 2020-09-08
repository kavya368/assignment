import java.util.*;  // 1 22 333 4444 55555
class pattern_2
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
                System.out.print(""+i);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern_2 obj=new pattern_2();
        obj.getData();
        obj.generatePattern();
    }
}
            
           
            
        