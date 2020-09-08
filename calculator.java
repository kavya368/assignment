
class calculator
{
    double a1,b1;
    char c1;
    double ans;
    void init(double a, double b, char c)
    {
        a1=a;
        b1=b;
        c1=c;
    }
    void calc()
    {
          if(c1=='+')
            {
            ans=a1+b1;
            System.out.println(ans);
            }
        else if(c1=='-')
      
             {
                 ans=a1-b1;
                 System.out.println(ans);
                }
                else if(c1=='*')
                {
                    ans=a1*b1;
                    System.out.println(ans);
                }
                else if(c1=='/')
                {
                    ans=a1/b1;
                    System.out.println(ans);
                }
                else 
                { 
                    System.out.println("Invalid");
                }
            }
     void display()
     {
         System.out.println(ans);
        }
       
     
     public static void main()
     
     {
         calculator obj= new  calculator();
         obj. init(2,3,'+');
         obj.calc();
         obj.display();
        }
    }

         
          
         
         
                    
    
    
        
           
            
    