class Shield {
    public static void main(String args[]) {
        System.out.println("Main Method");

        Shield s = new Shield();
        // s.mission();
        // s.failed();
        mission();
    }

    static void mission() {
        System.out.println("Mission method inside class");
        // failed();
    }

    void failed(){
        System.out.println("Failed inside class");
        mission();
    }
}

//===================================================

class Avenger{

    static void mission(String name, int age){
        System.out.println("Name of hero: "+ name);
        System.out.println("age of hero: "+ age);
    }

    String heroic_name(String hero){
        return "Heroic name is : "+hero;
    }
}

public class Shield{
    public static void main (String args[]) {
        System.out.println("Main Method");

        Avenger a = new Avenger();
        Avenger.mission("Steve Roger",110);

        String x = a.heroic_name("Captain");
        // String x = Avenger.heroic_name("Captian");
        System.out.println(x);
    }
}


