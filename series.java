package assignment;
class series
{
    public static void main()
    {
        int sum=0;
        for(int i=2;i<=20;i+=2)
        {
            if(i%4==0)
            {
                sum=sum-i;
            }
            else
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
        