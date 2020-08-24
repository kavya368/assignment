import java.util.*;
class class_driven
{
    void generateMenu()
    {
        System.out.println("What would you like to do");
        System.out.println("1.calculate value of sphere");
        System.out.println("2.calculate value of cylinder");
        System.out.println("3.calculate value of cone");
        System.out.println("Press any other number other than 1,2,3 to exit");
    }
    void calcSphereVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius;
        System.out.println("Enter the radius of sphere");
        radius=sc.nextInt();
        volume=(4/3)*(3.14)*radius*radius*radius;
        System.out.println("volume");
    }
    void calcCylinderVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius;
        int height;
        System.out.println("Enter the radius of sphere");
        radius=sc.nextInt();
        System.out.println("Enter the height of the cylinder");
        height=sc.nextInt();
        volume=(3.14)*radius*radius*height;
        System.out.println("volume");
    }
    void calcConeVolume()
    {
        Scanner sc=new Scanner(System.in);
        double volume;
        int radius;
        int height;
        System.out.println("Enter the radius of sphere");
        radius=sc.nextInt();
        System.out.println("Enter the height of the cylinder");
        height=sc.nextInt();
        volume=(3.14)*radius*radius*height/3;
        System.out.println(volume);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        class_driven obj=new class_driven();
        char choice;
        int opt;
        
        do 
        {
            obj.generateMenu();
            System.out.println("Enter your selection");
            opt=sc.nextInt();
            
            if(opt==1)
            obj.calcSphereVolume();
            else if (opt==2)
            obj.calcCylinderVolume();
            else if (opt==3)
            obj.calcConeVolume();
            else 
            return;
            
            System.out.println("Would you like to continue [y/n]");
            choice=(sc.next()).charAt(0);
        }
        while(choice=='y');
    }
}


            
            
     