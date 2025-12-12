class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog can bark");
    }
}

public class singlelevelin{
    public static void main(String[] args){
        Dog sc=new Dog();
        sc.eat();
        sc.barks();
    }
}