package university.hometuition;

import university.school.Student;

public class HomeTuitionStudent extends Student {
    
    public static void main(String args[]) {

        HomeTuitionStudent h = new HomeTuitionStudent();

        System.out.println(h.rollNo);    // ✓ public
        System.out.println(h.name);      // ✓ protected (inheritance)
        // System.out.println(h.marks);    // ✕ default
        // System.out.println(h.age);    // ✕ private
    }

}
