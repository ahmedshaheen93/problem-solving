package problems.demos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FindCommonItemsTest {
    private FindCommonItems findCommonItems = new FindCommonItems();

    /**
     * <b>case 1</b>
     * <br>
     * String[] array1 = {'a', 'b', 'c', 'x'};
     * <br>
     * String[] array2 = {'z', 'y', 'i'};
     * <br>
     * <b>should return false</b>.
     * <br>
     */
    @Test
    void noCommonItemsFounded() {
        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "i"};
        assertThat(findCommonItems.containAnyCommonItems(array1, array2)).isFalse();
    }

    /**
     * <b>case 2</b>
     * <br>
     * String[] array1 = {'a', 'b', 'c', 'x'};
     * <br>
     * String[] array2 = {'z', 'y', 'x'};
     * <br>
     * <b>should return true.</b>
     */
    @Test
    void foundCommonItems() {
        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "x"};
        assertThat(findCommonItems.containAnyCommonItems(array1, array2)).isTrue();

    }
}
