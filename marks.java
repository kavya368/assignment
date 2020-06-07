
package assignment;
class marks
{
    public static void main(int roll_no, String name,double m1, double m2, double m3)
    {
        System.out.println(name);
        System.out.println(roll_no);
        double average=m1+m2+m3/3;
        if(average >= 85 && average <=100)
        {
            System.out.println("EXCELLENT");
        }
        else if(average>= 75  &&  average <=84)
        {
            System.out.println("DISTINCTION");
        }
        else if(average >=60  && average<= 74)
        {
            System.out.println("FIRST CLASS");
        }
        else if(average>= 40 && average<=59)
        {
            System.out.println("PASS");
        }
        else if(average<40)
        {
            System.out.println("POOR");
        }
    }
}
    