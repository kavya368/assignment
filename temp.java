import java.util.*;
class temp
{
    double f;
    double cel;
    temp()
    {
        f=56;
    }
    void calc()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        f=sc.nextDouble();
        cel=(f-32)*5.0/9.0;
    }
    void display()
    {
        System.out.println(cel);
    }
    public static void main()
    {
        temp obj=new temp();
        obj.calc();
        obj.display();
    }
}

        
    