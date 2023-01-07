package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 200, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 10, 200};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {16, 25, 16, 17, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 16, 16, 17, 25};
        assertThat(result).containsExactly(expected);
    }
}