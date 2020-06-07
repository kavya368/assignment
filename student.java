
package assignment;
class student
{
     public static void main(String name,int roll_no,double m1,double m2,double m3,double m4,double m5)
    {
        double percentage=m1+m2+m3+m4+m5*100.0/500.0;
        if(percentage<=90)
        {
            System.out.println("Science with computers");
        }
        else if(percentage<=80   &&  percentage>=89)
        {
            System.out.println("Science without computers");
        }
        else if(percentage<=70   && percentage>=79)
        {
            System.out.println("Commerce with Maths");
        }
        else if(percentage<=60   &&  percentage>=69)
        {
            System.out.println("Commerce without Maths");
        }
    }
}
        
    

       
        
      
    