package Interface;

interface A{
    public static final int VALUE = 100;
    int VALUE = 100;
}

class Demo implements A {
    void show() {
        System.out.println("Value = " + VALUE);
    }
}

public class Concept_1 {
    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.show();

        // A a = new A();     // connot create object of an interface
    }
}
