import java.util.Scanner;

// count number of letters, numbers, symbols from string
class CharArray_sum4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            int letters = 0;
            int digits = 0;
            int special = 0;
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    letters++;
                }
                else if (ch >= '0' && ch <= '9') {
                    digits++;
                }
                else {
                    special++;
                }
            }
            
            System.out.println("Letters count: " + letters);
            System.out.println("Numbers count: " + digits);
            System.out.println("Special symbols count: " + special);
            System.out.println();
            
        
        sc.close();
    }
}
