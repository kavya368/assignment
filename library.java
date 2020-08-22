 import java.util.*;
class library 
{    
         int acc_num;
        String tittle;
     String author;
      int day;
  

void input()
{ 
    Scanner sc=new Scanner(System.in);
    
     acc_num=sc.nextInt();
    tittle=sc.nextLine();
    author=sc.nextLine();
}
void compute()
{
  Scanner sc=new Scanner(System.in);
  
  day=sc.nextInt();
  int fine=day*2;
  System.out.println(fine);
  }
   
void display()
{
  System.out.println("acc_num\ttittle\tauthor");
}
public static void main()
{
 library obj=new library();
obj.input();
obj.compute();
obj.display();
}
}









