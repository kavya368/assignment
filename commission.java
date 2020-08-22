import java.util.*;
class commission 
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value");
        int value=sc.nextInt();
        double comm;
        if(value<10000)
        {
            comm=5.0/100.0*value;
            System.out.println(comm);
        }
        else if(value>=10000   &&   value<= 50000)
        {
            comm=8.0/100.0*value;
            System.out.println(comm);
        }
        else if(value>50000)
        {
            comm=10.0/100.0*value;
            System.out.println(comm);
        }
        
    }

}