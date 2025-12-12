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

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy can weep");
    }
}

public class multilevelin{
    public static void main(String[] args){
        Puppy sc=new Puppy();
        sc.eat();
        sc.barks();
        sc.weep();
    }
}