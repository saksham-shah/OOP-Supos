package SV1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class SearchSetTest {
    @Test
    public void searchSet_emptySet() {
        SearchSet set = new SearchSet();

        String str = set.toString();
        int numElements = set.getNumberElements();

        assertThat(str).isEqualTo("<>");
        assertThat(numElements).isEqualTo(0);
    }

    @Test
    public void searchSet_setWithOneElement() {
        SearchSet set = new SearchSet();
        set.insert(3);

        String str = set.toString();
        int numElements = set.getNumberElements();

        assertThat(str).isEqualTo("<3>");
        assertThat(numElements).isEqualTo(1);
    }

    @Test
    public void searchSet_setWithMultipleElements() {
        SearchSet set = new SearchSet();
        set.insert(3);
        set.insert(7);
        set.insert(4);
        set.insert(2);
        set.insert(1);
        set.insert(8);

        String str = set.toString();
        int numElements = set.getNumberElements();

        assertThat(str).isEqualTo("<(3, (2, 1, -), (7, 4, 8))>");
        assertThat(numElements).isEqualTo(6);
    }

    @Test
    public void searchSet_contains() {
        SearchSet set = new SearchSet();

        boolean contains = set.contains(4);

        assertThat(contains).isEqualTo(false);

        set.insert(3);
        set.insert(7);
        set.insert(4);
        set.insert(2);
        set.insert(1);
        set.insert(8);

        contains = set.contains(4);

        assertThat(contains).isEqualTo(true);

        contains = set.contains(9);

        assertThat(contains).isEqualTo(false);
    }
}
