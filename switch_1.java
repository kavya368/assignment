import java.util.*;
class switch_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double ans;
        switch(a)
        {
            case 1: ans=Math.log(b);
            System.out.println(ans);
            break;
            case 2: ans=Math.abs(b);
            System.out.println(ans);
            break;
            case 3: ans=Math.sqrt(b);
            System.out.println(ans);
            break;
            case 4:ans=Math.random();
            System.out.println(ans);
            break;
            default: System.out.println("Invalid");
        }
    }
}
         
        