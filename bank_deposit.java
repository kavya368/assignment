 
class bank_deposit
{
    public static void main(double p,double r,double n,double n2)
    {
        char  a;
        double ans;
         n2=n2*12;
        
       
        switch('a' )
        {
            case 't' : ans=p*Math.pow(100.0+r/100.0,n);
            System.out.println("maturity amount is "+ans);
            break;
            case 'R':ans=n2*p+p*n2*n2+1*r/200.0*12.0;
            System.out.println("Maturity amount is"+ans);
            break;
            default:System.out.println("invalid");
            break;
        }
    }
}
            
            
    