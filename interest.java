class interest
{
    int p1, r1, t1;
    double ans;
    void init(int p,int r,int t)
    {
        p1=p;
        r1=r;
        t1=t;
    }
    void calc()
    {
        ans=p1*r1*t1/100;
        
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
      interest obj=new interest();
      obj.init(3000,8,4);
      obj.calc();
      obj.display();
    }
}
   
    
    
    