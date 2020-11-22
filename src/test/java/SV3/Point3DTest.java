package SV3;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Point3DTest {
    @Test
    public void Point3D_compareTo() {
        Point3D a = new Point3D(1, 2, 3);
        Point3D b = new Point3D(4, 2, 3);
        Point3D c = new Point3D(4, 2, 4);
        Point3D d = new Point3D(4, 1, 3);
        Point3D e = new Point3D(1, 2, 3);

        int compareAB = a.compareTo(b);
        int compareBA = b.compareTo(a);
        int compareBC = b.compareTo(c);
        int compareAC = a.compareTo(c);
        int compareAD = a.compareTo(d);
        int compareAE = a.compareTo(e);

        assertThat(compareAB).isLessThan(0);
        assertThat(compareBA).isGreaterThan(0);
        assertThat(compareBC).isLessThan(0);
        assertThat(compareAC).isLessThan(0);
        assertThat(compareAD).isGreaterThan(0);
        assertThat(compareAE).isEqualTo(0);
    }
}
