class Animal{
    void eat(){
        System.out.println("Animal is eating");     
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}

public class multilevelinheritance{
    public static void main(String[]args){
        Puppy obj=new Puppy();
        obj.eat();
        obj.barks();
        obj.weep();
    }
}