class demo{
    void show(int a , int b){
        int c=a+b;
        System.out.println(c);    
    }
}

class demo1 extends demo{
    void show(int a , int b){
        int c=a-b;
        System.out.println(c);
    }
}

class riding1{
    public static void main(String[]args){
        demo d1=new demo();
        d1.show(40,50);
        demo1 d2=new demo1();
        d2.show(40,30);
    }
}