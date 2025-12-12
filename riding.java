class ride {
    void show() {
        System.out.println("hello");
    }
}

class ride1 extends ride {
    void show() {
        System.out.println("world");
    }
}

class riding {
    public static void main(String[] args) {
        ride r1 = new ride();
        r1.show();

        ride1 r2 = new ride1(); 
        r2.show();
    }
}
