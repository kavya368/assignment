import java.util.*;
class movieMagic
{
    int year;
    String title;
    float rating;
   
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value year,title,rating");
        year=sc.nextInt();
        title=sc.nextLine();
        rating=sc.nextFloat();
    }
    void accept2()
    {
        if(rating<0.0 && rating>2.0)
        {
            System.out.println("movie is flop");
        }
        else if(rating<2.1 && rating<3.4)
        {
            System.out.println("Movie is semi-hit");
        }
        else if(rating < 3.5 && rating >4.5)
        {
            System.out.println("Movie is hit");
        }
        else if (rating < 4.6  && rating > 5.0)
        {
            System.out.println("Movie is super hit");
        }
    }
    public static void main()
    {
        movieMagic obj=new movieMagic();

        obj.accept();
        obj.accept2();
    }
}
        
        
    
       
       
      
        
