package SV1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class FunctionalArrayTest {
    @Test
    public void functionalArray_constructor() {
        FunctionalArray arr = new FunctionalArray(12);

        String str = arr.toString();

        assertThat(str).isEqualTo("<(0, (0, (0, 0, 0), (0, 0, -)), (0, (0, 0, -), (0, 0, -)))>");
    }

    @Test
    public void functionalArray_get_set() {
        FunctionalArray arr = new FunctionalArray(12);

        arr.set(0, 3);
        arr.set(3, 2);
        arr.set(5, 6);
        arr.set(10, 8);
        arr.set(11, -1);
        arr.set(5, 5);

        assertThat(arr.get(4)).isEqualTo(0);
        assertThat(arr.get(0)).isEqualTo(3);
        assertThat(arr.get(10)).isEqualTo(8);
        assertThat(arr.get(11)).isEqualTo(-1);
        assertThat(arr.get(5)).isEqualTo(5);
    }
}
