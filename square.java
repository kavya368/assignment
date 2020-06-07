class square
{
    int n1,ans;
    void init(int num1)
    {
        n1=num1;
    }
    void calc()
    {
        ans=n1*n1;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        square obj=new square();
        obj.init(4);
        obj.calc();
        obj.display();
    }
}