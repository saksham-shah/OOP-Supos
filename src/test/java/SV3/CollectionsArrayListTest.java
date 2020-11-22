package SV3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static com.google.common.truth.Truth.assertThat;

public class CollectionsArrayListTest {
    @Test
    public void collectionsArrayList_EmptyConstructor() {
        CollectionsArrayList<Integer> list = new CollectionsArrayList<>();

        String value = list.toString();

        assertThat(value).isEqualTo("[]");
    }

    @Test
    public void collectionsArrayList_CollectionConstructor() {
        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(collection);

        String value = list.toString();

        assertThat(value).isEqualTo("[1, 2, 3]");
    }

    @Test
    public void collectionsArrayList_ArrayConstructor() {
        Integer[] array = {1, 2, 3};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        String value = list.toString();

        assertThat(value).isEqualTo("[1, 2, 3]");
    }

    @Test
    public void collectionsArrayList_get() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        Integer element = list.get(3);

        assertThat(element).isEqualTo(4);
    }

    @Test
    public void collectionsArrayList_set() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        Integer element = list.set(1, 6);
        String value = list.toString();

        assertThat(element).isEqualTo(2);
        assertThat(value).isEqualTo("[1, 6, 3, 4, 5]");
    }

    @Test
    public void collectionsArrayList_add() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        list.add(6);
        String value = list.toString();

        assertThat(value).isEqualTo("[1, 2, 3, 4, 5, 6]");
    }

    @Test
    public void collectionsArrayList_addAtIndex() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        list.add(2, 6);
        String value = list.toString();

        assertThat(value).isEqualTo("[1, 2, 6, 3, 4, 5]");
    }

    @Test
    public void collectionsArrayList_remove() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        Integer element = list.remove(3);
        String value = list.toString();

        assertThat(element).isEqualTo(4);
        assertThat(value).isEqualTo("[1, 2, 3, 5]");
    }

    @Test
    public void collectionsArrayList_size() {
        Integer[] array = {1, 2, 3, 4, 5};
        CollectionsArrayList<Integer> list = new CollectionsArrayList<Integer>(array);

        Integer size = list.size();

        assertThat(size).isEqualTo(5);
    }
}
