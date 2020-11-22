package SV3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ReadFile {
    private static class Pair {
        private int x;
        private int y;

        public Pair(String data) {
            String[] numStrings = data.split(",");
            x = Integer.parseInt(numStrings[0]);
            y = Integer.parseInt(numStrings[1]);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private static class PairComparator implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.getX() == o2.getX()) {
                return o1.getY() - o2.getY();
            }

            return o1.getX() - o2.getX();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Pair> pairs = new ArrayList<>();

        File file = new File("q53.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Pair p = new Pair(data);
            pairs.add(p);
        }

        pairs.sort(new PairComparator());

        for (Pair p : pairs) {
            System.out.println(p.getX() + "," + p.getY());
        }
    }
}
