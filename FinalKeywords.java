public class FinalKeywords {
    
    public static void main(String [] args){
        A a = new A();
        // a.show();

        B b = new B();
        b.show();
        //b.staticshow();
    }
}

//final class A {
class A {

    //final int y=10;
    
    final int y;

    A(){
        y=200;
    }

    // final void show(){
    void show(){
        //y=20;
        System.out.println("value of y: "+y);
        System.out.println("This is a class A");
    }

}
class B extends A{

    // static final int z=100;
    // static final int z;
    static final int z;
    static{
        z=500;
    }
    void staticshow(){
        //z=20;
        System.out.println("Value of z: "+z);
    }

    void show(){
        //final int x=10;     // we cannot reassign

        final int x;
        x=200;
        System.out.println("value of x: " + x);
        System.out.println("This is a class B");
    }
}
