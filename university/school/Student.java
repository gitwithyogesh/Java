package university.school;

// Base Class

public class Student {

    public int rollNo = 1;            // public
    protected String name = "Tony";   // protected
    int marks = 90;                   // default
    private int age = 15;             // private

    public void showDetails() {
        // Same class ➡️ all accessible
        
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(age);

    }
    
}
