class average
{
    int n1,n2,n3,ans;
    void init(int m1, int m2, int m3)
    {
        n1=m1;
        n2=m2;
        n3=m3;
    }
    void calc()
    {
        ans=n1+n2+n3/3;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        average obj=new average();
        obj.init(20,30,45);
        obj.calc();
        obj.display();
    }
}
        
        
        
        
        
        
        
