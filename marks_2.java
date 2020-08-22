import java.util.*;
class marks_2
{
    double m1,m2,m3;
    String name;
    double average;
    marks_2(double n1,double  n2,double n3)
    {
        m1=n1;
        m2=n2;
        m3=n3;
        name="kavya";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        name=sc.nextLine();
        m1=sc.nextDouble();
        m2=sc.nextDouble();
        m3=sc.nextDouble();
    }
    void calc()
    {
        average=m1+m2+m3/3;
        if(m1>m2 &&m1>m3)
        {
            System.out.println("greatest marks are"+m1);
        }
        else if (m2>m1   &&  m2>m3)
        {
            System.out.println("greatest marks are"+m2);
        }
        else 
        {
            System.out.println("greatest marks are"+m3);
        }
    }
    void display()
    {  
        System.out.println(average);
        System.out.println(name);
    }
}
    class trymarks
    {
     public static void main()
    {
        marks_2 obj=new marks_2();
        obj.accept();
        obj.calc();
        obj.display();
    }
}
        
    
   
   
        