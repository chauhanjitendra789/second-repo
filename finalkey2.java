final class vehicle{
    void display(){
        System.out.println("This is a vehicle class(final).");
    }
}

class car extends vehicle{
    void show(){
        System.out.println("car is extending vehicle");
    }
}

public class finalkey2{
    public static void main(String[]args){
        car c=new car();
        c.display();
        c.show();
    }
}