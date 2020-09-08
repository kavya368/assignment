import java.util.*;
class menu_driven
{ 
    void generateMenu()
    {
    
        System.out.println("What would you like to do");
        System.out.println("1.calculate buzz number");
        System.out.println("2.calculate GCD of number");
        System.out.println("Press any other number other than 1,2 to exit");
    }
    void calcBuzz()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%10==7  || num%7==0)
        {
            System.out.println("It is a buzz number");
        }
        else 
        {
            System.out.println("Not a buzz number");
        }
    }
    void calcGcd()
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,hcf;
        System.out.println("Enter the value");
        num1=sc.nextInt();
        System.out.println("Enter the value");
        num2=sc.nextInt();
        
        for(int i=1;i<=num1;i++)
        { 
         if(num1%i==0 && num2%i==0)
           {
             hcf=i;
             int lcm=num1*num2/hcf;
                  System.out.println(hcf);
            }
         
        }
   
    }
    public static void main()
    {
        menu_driven obj=new menu_driven();
        obj.calcBuzz();
        obj.calcGcd();
    }
}
        
       
    
        
        
    
    
