import java.util.Scanner;

class ATM {

    public static void main(String args[]) {
        int pin = 5005;
        int AccNo = 81118;
        int bal = 91000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Account number : ");
        int checkacc = sc.nextInt();

        System.out.println("Enter your Pincode : ");
        int checkpin = sc.nextInt();

        if (checkacc == AccNo && checkpin == pin) {
            while (true) {

                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your option : ");

                int option = sc.nextInt();

                switch (option) {
                    case 1:

                        System.out.println("Enter amount to withdraw");
                        int debit = sc.nextInt();

                        if (debit > bal) {
                            System.out.println("Insufficient Balance! ");
                        } else {
                            bal -= debit;
                            System.out.println("Withdrawal Successfull ! , Remaining Balance " + bal);
                        }
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit : ");
                        int credit = sc.nextInt();
                        bal += credit;

                        System.out.println("Amount Debited Successfully , Updated Balance " + bal);
                        break;

                    case 3:
                        System.out.println("Your Current Balance " + bal);
                        break;

                    case 4:
                        System.out.println("Thankyou For using ATM !");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Option! Please try again.");
                }

            }

        } else {
            System.out.println("Invalid PinCode OR Account Number");

        }
    }
}
