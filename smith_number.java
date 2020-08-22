
 
class smith_number
{
    public static void main(int num)
    {
        int sum=0;
         for(int i = 2; i< num; i++) 
         {
         while(num%i == 0) 
         {
            System.out.println(i+" ");
            num = num/i;
        }
    }
    if(num>2)
    {
        System.out.println(num);
    }
}
}
 

