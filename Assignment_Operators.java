class Assignment_Operators {
    public static void main(String args[]){
        // Assignment (=)
        int x = 5;
        System.out.println("Assignment: " + x);

        // Addition Assignment (+=)
        x += 3; // Equivalent to x=x+3
        System.out.println("Addition Assignment: " + x);

        // Subtraction Assignment (-=)
        x -= 2; // Equivalent to x=x-2
        System.out.println("Subtraction Assignment: " + x);

        // Multiplication Assignment (*=)
        x *= 4; // Equivalent to x=x*4
        System.out.println("Multiplication Assignment: " + x);

        // Division Assignment (/=)
        x /= 2; // Equivalent to x=x/2
        System.out.println("Division Assignment: " + x);

        // Floor division Assignment (//=)
        // Java Automatically uses integer division for integers
        x /= 3; // Equivalent to x=x/3 (integer division)
        System.out.println("Floor Division Assignment: " + x);

        // Modulo Assignment (%=)
        x %= 4; // Equivalent to x=x%4
        System.out.println("Modulo Assignment: " + x);


    }
}
