package SV2;

public class TryFinally {
    public static int x() {
        try {
            System.out.println("Try");
            return 6;
        }
        finally {
            System.out.println("Finally");
            return 7;
        }
    }

    public static void main(String[] args) {
        System.out.println(x());
    }
}
