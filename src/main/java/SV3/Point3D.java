package SV3;

import java.util.Objects;

public class Point3D implements Comparable<Point3D> {
    private final int x;
    private final int y;
    private final int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(Point3D o) {
        if (z != o.z) {
            return z - o.z;
        }

        if (y != o.y) {
            return y - o.y;
        }

        return x - o.x;
    }
}
