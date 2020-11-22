package SV3;

import java.lang.reflect.Array;
import java.util.*;

public class NamesMarks {
    TreeMap<String, Integer> marksMap;

    public NamesMarks() {
        marksMap = new TreeMap<>();
    }

    public NamesMarks(String[] names, Integer[] marks) {
        marksMap = new TreeMap<>();
        for (int i = 0; i < names.length && i < marks.length; i++) {
            addMark(names[i], marks[i]);
        }
    }

    public void addMark(String name, Integer mark) {
        marksMap.put(name, mark);
    }

    public List<String> allStudents() {
        ArrayList<String> names = new ArrayList<>();

        Set<String> namesSet = marksMap.keySet();

        for (String name : namesSet) {
            names.add(name);
        }

        return names;
    }

    public List<String> topStudents(int p) {
        if (p < 0 || p >= 100) {
            throw new IndexOutOfBoundsException();
        }

        List<Integer> marks = sortedMarks();
        int index = marks.size() * p / 100;
        int passMark = marks.get(index);

        ArrayList<String> names = new ArrayList<>();

        Set<String> namesSet = marksMap.keySet();

        for (String name : namesSet) {
            if (marksMap.get(name) >= passMark) {
                names.add(name);
            }
        }

        return names;
    }

    public Integer medianMark() {
        List<Integer> marks = sortedMarks();

        if (marks.size() == 0) {
            throw new NoSuchElementException();
        }

        if (marks.size() % 2 == 0) {
            int total = marks.get(marks.size() / 2) + marks.get(marks.size() / 2 - 1);
            return total / 2;
        }

        return marks.get((marks.size() - 1) / 2);
    }

    private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    private List<Integer> sortedMarks() {
        List<Integer> marks = (List<Integer>) marksMap.values();
        marks.sort(new IntegerComparator());
        return marks;
    }
}
