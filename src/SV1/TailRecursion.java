package SV1;

public class TailRecursion {

    public static void main(String[] args) {
        // This resulted in a stack overflow (expected)
        // addRec(0, -1);

        // However, this code also resulted in a stack overflow
        // If there was tail-recursion optimisation, it should have run forever
        // without overflowing the stack
        addTailRec(0, -1, 0);
    }

    public static int addRec(int a, int b) {
        if (b == 0) return a;

        return 1 + addRec(a, b - 1);
    }

    public static int addTailRec(int a, int b, int total) {
        if (b == 0) return a + total;

        // This is tail recursive as the return statement only references a call to itself
        // There are no other variables to store on the stack
        return addTailRec(a, b - 1, total + 1);
    }
}
