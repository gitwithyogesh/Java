import java.util.Scanner;

class UserInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //String (whole line)
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        //String (single word)
        // System.out.print("Enter your nickname: ");
        // String nickname = sc.next();   //stops at space/

        // int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        //float
        System.out.print("Enter your height in meters (eg: 1.75): ");
        float height = sc.nextFloat();

        //Double
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();


        System.out.println("/nYour full name is "+fullName);
        System.out.println("Your age is "+age);
        System.out.println("Your Phone number "+phone);
        System.out.println("Your Height is "+height);
        System.out.println("Your GPA score is "+gpa);

        sc.close();



    }
}
