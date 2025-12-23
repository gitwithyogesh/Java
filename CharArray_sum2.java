import java.util.Scanner;


// Convert Uppercase to lowercase OR vise versa
class CharArray_sum2 {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter your character: ");
        char ch = sc.next().charAt(0);

        if( ch >= 'a' && ch <= 'z') {
            // lowercase → uppercase
            ch = (char) (ch - 32);
            System.out.println("Converted Character: " + ch);
        } 
        else if (ch >= 'A' && ch <= 'Z') {
            // uppercase → lowercase
            ch = (char) (ch + 32);
            System.out.println("Converted character: " + ch);
        } 
        else {
            System.out.println("Please enter a valid alphabet character.");
        }

        sc.close();
    }
}
