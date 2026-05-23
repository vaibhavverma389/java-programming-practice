public class methodover {
    int add(int a,int b)
    {
        return  a+b;

    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        methodover mo = new methodover();
        System.out.println(mo.add(2,5));
        System.out.println(mo.add(4.66,7.34));
        System.out.println(mo.add(2, 3, 4));


    }
    
}
