abstract class Avenger {
    String name;

    abstract void attack(); // abstract method

    // abstract void attack1(); // abstract method

    void introduce() { // regular method
        System.out.println("I am " + name);
    }
}

// Subclasses implement the abstract method
class IronMan extends Avenger {
    void attack() {
        System.out.println("Iron Man attacks with lasers!");
    }
}

class Thor extends Avenger {
    void attack() {
        System.out.println("Thor attacks with lightning!");
    }
}

class Abstraction {

    public static void main(String[] args) {
        // Avenger hero = new Avenger();  

        // Avenger is an abstract class, so you cannot create an object directly.
        // But you can use it as a reference to point to objects of its subclasses.

        
        IronMan i = new IronMan();
        i.name="Tony Stark";
        i.introduce();
        i.attack();
        
        Thor t = new Thor();
        t.name="Thor";
        t.introduce();
        t.attack();

       

    }
}