public class SwitchExample {
    public static void main(String[] args) {
        int day = 3; // Change this value to test different cases

        switch (day) {
            case 1:
                System.out.println("Monday: Start of the work week!");
                break;
            case 2:
                System.out.println("Tuesday: Keep the momentum going!");
                break;
            case 3:
                System.out.println("Wednesday: Midweek is here!");
                break;
            case 4:
                System.out.println("Thursday: Almost there!");
                break;
            case 5:
                System.out.println("Friday: Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday: Time to relax!");
                break;
            case 7:
                System.out.println("Sunday: Prepare for the week ahead!");
                break;
            default:
                System.out.println("Invalid day: Please enter a number between 1 and 7.");
        }
    }
}
