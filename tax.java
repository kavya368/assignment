import java.util.*;
 class tax
{
    int pan;
    String name;
    double taxincome;
    double tax;
    tax()
    {
        pan=323947;
        name="s";
        taxincome=30000;
        tax=4093;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        pan=sc.nextInt();
        name=sc.nextLine();

        
        tax=sc.nextDouble();
    }
    void calc()
    {
        double tt;
        if(taxincome>= 100000)
        {
            System.out.println("no tax");
        }
        else if(taxincome<=100001   &&  taxincome>=150000)
        {
           tt=10/100*taxincome;
           System.out.println(tt);
        }
        else if (taxincome<=150001   &&   taxincome>= 250000)
        {
            tt=5000+20/100*taxincome;
            System.out.println(tt);
        }
        else 
        {
            tt=25000+30/100*taxincome;
            System.out.println(tt);
        }
    }
    
     
    public static void main()
    {
        tax obj =new tax();
        obj.input();
        obj.calc();
    }
}
    
        
      
        
            
       
            
        
        
            