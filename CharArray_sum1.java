import java.util.Scanner;

class CharArray_sum1 {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter your Character: " );
        char a = x.next().charAt(0);

        a = Character.toLowerCase(a);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("Character is Vowel.");
        } 
        else {
            System.out.println("Character is Consonant.");
        }
        x.close();

    }
}
