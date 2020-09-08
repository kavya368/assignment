import java.util.*;
class Eshop
{
    char ch;
    String addres;
    double a;
    double discount;
    double net;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of name,addres,amount,amount,type of purchase");
        String name=sc.nextLine();
         ch=sc.next().charAt(0);
        addres=sc.nextLine();
        double a=sc.nextDouble();
        
       
    }
    void calc()
    {
        if(a>25000 &&  ch=='l'  || ch=='L')
        {
            discount=a;
            net=a;
            System.out.println(net);
        }
        else if(a>25000  && ch=='d' || ch=='D')
        {
            discount=a*5.0/100;
            net=a-discount;
            System.out.println(net);
        }
        else if(a>25001 && a<57000 && ch=='l' || ch=='L')
        {
            discount=a*5.0/100;
            net=a-discount;
            System.out.println(net);
        }
        else if(a>25001 && a<57000 && ch=='d' || ch=='D')
        {
            discount=a*7.5/100;
            net=a-discount;
            System.out.println(net);
        }
        else if(a>57001  && a<100000  && ch=='l'  || ch=='L')
        {
            discount=a*7.5/100;
            net=a-discount;
            System.out.println(net);
        }
        else if(a>57001  && a<100000  && ch=='d'  || ch=='D')
        {
            discount=a*10.0/100;
            net=a-discount;
            System.out.println(net);
        }
        else if(a>100000 ||   ch='l'  ||  ch=='L')
        {
            discount=a*10.0/100;
            net=a-discount;
            System.out.println(net);
        }
        else if (a>100000 || ch='d'  || ch=='D')
        {
            discount=a*15.0/100;
            net=a-discount;
            System.out.println(net);
        }
    }
    public static void main()
    {
        Eshop obj=new Eshop();
        obj.input();
        obj.calc();
    }
}
            
      
        
        
        
        
        
        
        
        
            
        
        
         