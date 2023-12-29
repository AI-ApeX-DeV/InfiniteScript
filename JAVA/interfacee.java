class A {
    public void displaya() {
        System.out.println("A");
    }
}

interface B {
    void display();
}

class C implements B {
    @Override
    public void display() {
        System.out.println("C");
    }
}

public class interfacee {
    public static void main(String[] args) {
        A objA = new A();

        // Creating an anonymous inner class that extends class A
        A obj = new A() {
            @Override
            public void displaya() {
                System.out.println("In anonymous inner class");
            }
        };

        obj.displaya();

        // Creating an anonymous inner class that implements interface B
        B objB = new C();
        objB.display();


    }
}
