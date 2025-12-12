class demo3{
    int a=10, b=20;

    void calc(){
        int c=a+b;
        System.out.println(c);
    }

    int calcu(){
        int c=a-b;
        return c;
    }

    public static void main(String[]args)
    {
        demo3 d1=new demo3();
        d1.calc();
        System.out.println(d1.calcu());
    }
}