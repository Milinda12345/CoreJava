public class Main {
    public static void main(String[] args) {

        int i = 4;
        int count = 4;

        while (i < 5) {
            System.out.println(i); // This will not execute
            break;
        }
        do {
            System.out.println(count);
            break ;
        } while (count < 5) ;
            count++; // Increment the counter
            System.out.println("Count is: " + count);


        }



}