package SV3;

public class Car implements Comparable<Car> {
    private String manufacturer;
    private int age;

    public Car(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Car o) {
        return manufacturer.compareTo(o.manufacturer);
    }
}
