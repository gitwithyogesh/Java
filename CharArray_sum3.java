import java.util.Scanner;


// find if given input character is uppercase or lowercase
class CharArray_sum3 {
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

         while(true){

             System.out.print("Enter a character: ");
             char ch = sc.next().charAt(0);

             if (ch == '0') {
                System.out.println("Program exited.");
                break;
            }
             
             if (ch >= 'A' && ch <= 'Z') {
                 System.out.println("The character is UPPERCASE.");
                }
                else if (ch >= 'a' && ch <= 'z') {
                    System.out.println("The character is lowercase.");
                }
                else {
                    System.out.println("The input is not an alphabet character.");
                }
                
            }
            sc.close();
    }
}
