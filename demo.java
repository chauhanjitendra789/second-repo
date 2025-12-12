class demo{
    int a=10 , b=20;


void add(){
    int c=a+b;
    System.out.println(c);
}

void add (int a , int b){
    int p=a+b;
    System.out.println(p);
}

int addition(){
    int f=a+b;
    return f;
}

public static void main(String[]args){
    demo d1=new demo();
    d1.add();
    d1.add(40,50);
    System.out.println(d1.addition());
}
}