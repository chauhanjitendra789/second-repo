class demo1{
    int a=10, b=20;

void add(){
    int c=a+b;
    System.out.println(c);
}

void add(int a, int b){
    int p=a+b;
    System.out.println(p);
}

void sub(){
    int c=a-b;
    System.out.println(c);
}

void sub(int a, int b){
    int p=b-a;
    System.out.println(p);
}

public static void main(String[]args){
    demo1 d1=new demo1();
    d1.add();
    d1.add(20,30);
    d1.sub();
    d1.sub(30,10);
}
}