package university.school;

// Same Package, Different Class

public class Teacher {

    public static void main(String args[]) {

        Student s = new Student();

        System.out.println(s.rollNo);     //  ✓ public
        System.out.println(s.name);       //  ✓ protected
        System.out.println(s.marks);      //  ✓ default
        // System.out.println(s.age);     //  ✕ private (ERROR)

        System.out.println("=====Show Details Method is called=====");

        s.showDetails();
    }
    
}
