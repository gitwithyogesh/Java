package university.hometuition;

// Different package, not a Subclass 

import university.school.Student;

public class HomeTuitionTeacher {

    public static void main(String args[]) {
        Student s = new Student();

        System.out.println(s.rollNo);      // ✓ public
        // System.out.println(s.name);     // ✕ protected
        // System.out.println(s.marks);    // ✕ default
        // System.out.println(s.age);      // ✕ private
    }
    
}
