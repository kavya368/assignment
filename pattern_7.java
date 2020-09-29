import java.util.*;
class pattern_7
{
    int i,j,n;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n=sc.nextInt();
    }

    void generatePattern()
    {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            } 
            System.out.println("");
     }
 }
 public static void main()
 {
     pattern_7 obj=new pattern_7();
     obj.accept();
     obj.generatePattern();
    }
}
