import java.util.*;
class garment_store
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         float amount,discount=0,adiscount=0,namount=0;
         amount =sc.nextFloat();
         System.out.println("Enter the value");
         if(sc.hasNextFloat())
         {
             amount=sc.nextFloat();
            }
             else if(amount<=5000)
             {
                 discount=400;
                }
                 else if( amount>5000 && amount<=10000)
                 {
                     discount=800;
                    }
                      else if(amount>10000 && amount<=20000)
                      {
                           discount=2000;
                        }
                          else if(amount>20000)
                          {
                          discount=2000;
                        }
                       
                        namount=amount-discount;
                        System.out.println(amount);
                        System.out.println(discount);
                    }
                }
                        
        

    
  
    