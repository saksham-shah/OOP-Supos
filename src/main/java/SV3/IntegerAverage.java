package SV3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerAverage {
    public static double forLoop(List<Integer> array) {
        double total = 0;

        for (int i = 0; i < array.size(); i++) {
            total += array.get(i);
        }

        return total / array.size();
    }

    public static double forEach(List<Integer> array) {
        double total = 0;

        for (int val : array) {
            total += val;
        }

        return total / array.size();
    }

    public static double iterator(List<Integer> array) {
        double total = 0;

        Iterator<Integer> it = array.iterator();

        while(it.hasNext()) {
            total += it.next();
        }

        return total / array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(forLoop(array));
        System.out.println(forEach(array));
        System.out.println(iterator(array));
    }
}
