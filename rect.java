class rect
{
    int n1,n2,ans;
    void init(int m,int m2)
    {
        n1=m;
        n2=m2;
    }
    void calc()
    {
        ans=n1*n2;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        rect obj=new rect();
        obj.init(4,6);
        obj.calc();
        obj.display();
    }
}
    
        
      