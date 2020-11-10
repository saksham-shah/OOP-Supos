package SV1;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println(lowestCommon(25L, 14L));

        System.out.println(lowestCommon(7L, 56L));

        System.out.println(lowestCommon(1L, 19L));

        System.out.println(lowestCommon(127L, 64L));
    }

    static int lowestCommon(long a, long b) {
        int bit = 0;

        // Keep dividing both numbers by two
        while (bit >= 0) {
            // If this is equal, we have reached a common bit
            if (a % 2 == b % 2) break;

            // Otherwise, go one space to the left and divide both numbers
            bit++;

            a /= 2;
            b /= 2;

            // If either number reaches zero, there are no common bits
            if (a == 0 || b == 0) {
                bit = -1;
            }
        }

        return bit;
    }
}
