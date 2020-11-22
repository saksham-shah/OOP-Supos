package SV3;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getManufacturer().equals(o2.getManufacturer())) {
            return o1.getAge() - o2.getAge();
        }

        return o1.getManufacturer().compareTo(o2.getManufacturer());
    }
}