import java.util.*;
class salary 
{
    double salary;
    double da;
    double hra;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        salary=sc.nextInt();
    }
    void calc()
    {
        if(salary<12000)
        {
            da=10.0*salary/100.0;
            hra=5.0*salary/100.0;
        }
        else if(salary>=12000  && salary<=18000)
        {
            da=25.0*salary/100.0;
            hra=15.0*salary/100.0;
        }
        else if(salary>=18000   &&  salary<25000 )
        {
            da=30.0*salary/100.0;
            hra=25.0*salary/100.0;
        }
        else 
        {
            da=40*salary/100.0;
            hra=30.0*salary/100.0;
        }
        System.out.println(da);
        System.out.println(hra);
    }
    public static void main()
    {
        salary obj=new salary();
        obj.getData();
        obj.calc();
    }
}
        
        