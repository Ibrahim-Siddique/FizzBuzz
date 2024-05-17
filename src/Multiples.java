public class Multiples {
    public static void main(String[] args) {
        // Counter to track how many multiples of 3 or 5 there are
        int count = 0;

        // Loop over non-negative integers below 1000
        for (int i = 0; i < 1000; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;

            if (divisibleByThree || divisibleByFive) {
                // Increment counter
                count++;
            }
        }

        System.out.println(count);
    }
}
