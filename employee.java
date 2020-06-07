
package assignment;
class employee 
{
   String name;
   float salary;
   float total_s;
   void init(String name2, float salary2)
   {
       name=name2;
       salary=salary2;
    }
   void calc()
   {
       float hra=50*salary/100;
        total_s=hra+salary;
    }
   void display()
   {
       System.out.println(total_s);
    }
   public static void main(String name2, float salary2 )
   {
       employee obj=new employee();
       obj.init(name2,salary2);
       obj.calc();
       obj.display();
    }
}
       
       
  
   