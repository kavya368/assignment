import java.util.*;
class juice 
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    int discounted_prize;
    
    juice()
    {
        product_code=222;
        flavour="o";
        pack_type="r";
        pack_size=22;
        product_price=200;
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        product_code=sc.nextInt();
        flavour=sc.nextLine();
        pack_type=sc.nextLine();
        pack_size=sc.nextInt();
        product_price=sc.nextInt();
     
    }
    
    void discount()
    {
           discounted_prize=product_price-10;
        }
    
    
    void display()
    {
        System.out.println(product_code);
        System.out.println(flavour);
        System.out.println(pack_type);
        System.out.println(pack_size);
        System.out.println(discounted_prize);
    }
    
    public static void main(String args[])
    {
        
        juice obj=new juice();
        obj.input();
        obj.discount();
        obj.display();
        
    }
}

    
    
    
        
        
    
      