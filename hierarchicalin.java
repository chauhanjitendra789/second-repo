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

class Cat extends Animal{
    void meow(){
        System.out.println("cat can meow");
    }
}

public class hierarchicalin{
    public static void main(String[] args){
        Dog sc=new Dog();
        sc.eat();
        sc.barks();

        System.out.println("--------");
         
        Cat s1=new Cat();
        s1.eat();
        s1.meow();
    }
}