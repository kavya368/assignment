import java.util.*;
class calc
{ 
    double a,b;
    char ch;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        a=sc.nextDouble();
        b=sc.nextDouble();
        ch = sc.next().charAt(0);
    }
    void calc()
    {
        if(ch=='+')
        {
            double add=a+b;
            System.out.println(add);
        }
        else if(ch=='-')
        {
            double sub=a-b;
            System.out.println(sub);
        }
        else if(ch=='*')
        {
            double mul=a*b;
            System.out.println(mul);
        }
        else if (ch=='/')
        {
            double div=a/b;
            System.out.println(div);
        }
        else if(ch=='%')
        {
            double mod=a%b;
            System.out.println(mod);
        }
    }
        public static void main()
        {
            calc obj=new calc();
            obj.accept();
            obj.calc();
        }
    }
    
       
           
            
        

    
   
  
    