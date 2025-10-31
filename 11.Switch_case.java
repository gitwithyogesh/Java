class Switch_case {
    public static void main(String args[]) {

        //swtich statement for fruit
        System.out.println("=========Switch Statement=======");
        String fruit = "apple";

        switch (fruit) {
            case "banana" :
            System.out.println("Banana is Yellow");
            break;
            case "apple" :
            System.out.println("Apple is Red");
            break;
            case "orange" :
            System.out.println("Orange is Orange");
            break;
            default:
            System.out.println("I dont know the color of this fruit");
        }
        System.out.println();


        

        // Switch statements for days(no user inputs)
        int day = 3; 
        String dayName;

        switch (day) {
            case 0:
            dayName = "Sunday";
            break;
            
            case 1:
            dayName = "Monday";
            break;

            case 2:
            dayName = "Tuesday";
            break;

            case 3:
            dayName = "Wednesday";
            break;

            case 4:
            dayName = "Thursday";
            break;

            case 5:
            dayName = "Friday";
            break;

            case 6:
            dayName = "Saturday";
            break;

            default:
            dayName = "Invalid day";

        }
        System.out.println("Today is " + dayName);
    }
}
