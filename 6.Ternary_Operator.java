class Ternary_Operator {
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // Using If-Else Statement
        int maxIfElse;
        if (a > b) {
            maxIfElse = a;
        } else {
            maxIfElse = b;
        }
        System.out.println("Using If-Else: The Maximum value is: " + maxIfElse);

        // Using Ternary Operator
        int maxTernary = (a > b) ? a : b;
        System.out.println("Using Ternary: The maximum value is: " + maxTernary);
    }
}
