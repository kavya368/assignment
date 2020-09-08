import java.util.Scanner;

public class spy_number
{
    void value()
    
    {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int orgNum = num;
        
        int digit, sum = 0, prod = 1;
        
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        if (sum == prod)
        {
            System.out.println(orgNum + " is Spy Number");
        }
        else
        {
            System.out.println(orgNum + " is not Spy Number");
  
    }
}
    public static void main()
    {
        spy_number obj=new spy_number();
        obj.value();
        
    
}
}
