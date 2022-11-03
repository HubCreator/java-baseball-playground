import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {

    @Test
    void rangeTest() {
        assertThat(ValidationUtil.isValidRange(1)).isTrue();
        assertThat(ValidationUtil.isValidRange(0)).isFalse();
        assertThat(ValidationUtil.isValidRange(9)).isTrue();
        assertThat(ValidationUtil.isValidRange(10)).isFalse();
    }

    @Test
    void threeNumTest() {
        assertThat(ValidationUtil.isSizeOfThree(Arrays.asList(1, 2, 3))).isTrue();
        assertThat(ValidationUtil.isSizeOfThree(Arrays.asList(1, 2))).isFalse();
        assertThat(ValidationUtil.isSizeOfThree(Arrays.asList(1, 2, 3, 4))).isFalse();
    }

    @Test
    void duplicateTest() {
        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1, 2, 3))).isTrue();
        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1, 2))).isTrue();
        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1))).isTrue();

        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1, 2, 2))).isFalse();
        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1, 1, 1))).isFalse();
        assertThat(ValidationUtil.hasDuplicatedNum(Arrays.asList(1, 1, 1, 1))).isFalse();
    }

    /*@Test
    void totalValidationTest() {
        assertThat(ValidationUtil.isValid(123)).isTrue();

        assertThat(ValidationUtil.isValid(1234)).isFalse();
        assertThat(ValidationUtil.isValid(12)).isFalse();

        assertThat(ValidationUtil.isValid(122)).isFalse();
    }*/
}
