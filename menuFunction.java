import java.util.*;
class menuFunction 
{
      void input ()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want absolute value");
        double n=sc.nextDouble();
        double abs=Math.abs(n);
        System.out.println("The absolute value is"+abs);
    }
    void sqrt()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root");
        double n=sc.nextDouble();
        double sqrt=Math.sqrt(n);
        System.out.println("The square root of the number is"+sqrt);
    }
    void ran()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for random");
        double n=sc.nextDouble();
        double ran=Math.random();
        System.out.println("A random number between 0 and 1 is"+ran);
    }
    public static void main()
    {
        menuFunction obj=new menuFunction();
        Scanner sc=new Scanner(System.in);
        char c;
        int opt;
        do 
        {
            obj.input();
            System.out.println("Enter your selection [1/2/3/4]");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.log();
            }
            else if(opt==2)
            {
                obj=sval();
            }
            else if(opt==3)
            {
                obj.sqrt();
            }
            else if(opt==4)
            {
                obj.ran();
            }
            else
            {
                return;
            }
            System.out.println("would you like to continue[y/n]");
            c=sc.next().charAt(0);
        }
        while(c=='y');
    }
}

        
           
                