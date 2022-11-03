import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {

    @Test
    void rangeTest() {
        assertThat(ValidationUtil.isValidRange(Arrays.asList(1))).isTrue();
        assertThat(ValidationUtil.isValidRange(Arrays.asList(0))).isFalse();
        assertThat(ValidationUtil.isValidRange(Arrays.asList(9))).isTrue();
        assertThat(ValidationUtil.isValidRange(Arrays.asList(10))).isFalse();
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

    @Test
    void totalValidationTest() {
        assertThat(ValidationUtil.isValid(Arrays.asList(1,2,3))).isTrue();

        assertThat(ValidationUtil.isValid(Arrays.asList(1,2,3,4))).isFalse();
        assertThat(ValidationUtil.isValid(Arrays.asList(1,2))).isFalse();

        assertThat(ValidationUtil.isValid(Arrays.asList(1,2,10))).isFalse();
        assertThat(ValidationUtil.isValid(Arrays.asList(0,2,9))).isFalse();

        assertThat(ValidationUtil.isValid(Arrays.asList(1,1,2))).isFalse();
        assertThat(ValidationUtil.isValid(Arrays.asList(1,9,9))).isFalse();

        assertThat(ValidationUtil.isValid(Arrays.asList(0,1,2,3))).isFalse();
        assertThat(ValidationUtil.isValid(Arrays.asList(1,2,3,10))).isFalse();
        assertThat(ValidationUtil.isValid(Arrays.asList(1,10))).isFalse();
    }
}
