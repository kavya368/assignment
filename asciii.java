class ascii
{
    public void dispascii()
    {
        char chA='A';
        char chZ='Z';
        char cha='a';
        char chz='z';
        int ascA, ascZ, asca, ascz;
        ascA=(int)  chA;
        ascZ=(int)  chZ;
        asca=(int)  cha;
        ascz=(int)  chz;
        System.out.println(ascA);
        System.out.println(ascz);
        System.out.println(asca);
        System.out.println(ascz);
    }
}
public  class asciii
{
    public static void main(String args[])
    {
        ascii object1;
        object1=new ascii();
        object1.dispascii();
    }
}
