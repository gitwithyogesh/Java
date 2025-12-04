package Interface;

class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

interface A {
    void m1();
}

class Child extends Parent implements A {
    public void m1() {
        System.out.println("Child: m1 implemented");
    }
}

public class Concept_3 {
    public static void main(String args[]) {
        Child c = new Child();
        c.parentMethod();
        c.m1();
    }
}