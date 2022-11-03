import org.junit.jupiter.api.Test;

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
        assertThat(ValidationUtil.isSizeOfThree(123)).isTrue();
        assertThat(ValidationUtil.isSizeOfThree(12)).isFalse();
        assertThat(ValidationUtil.isSizeOfThree(1234)).isFalse();
    }

    @Test
    void duplicateTest() {
        assertThat(ValidationUtil.hasDuplicatedNum(123)).isTrue();
        assertThat(ValidationUtil.hasDuplicatedNum(12)).isTrue();
        assertThat(ValidationUtil.hasDuplicatedNum(1)).isTrue();

        assertThat(ValidationUtil.hasDuplicatedNum(122)).isFalse();
        assertThat(ValidationUtil.hasDuplicatedNum(111)).isFalse();
        assertThat(ValidationUtil.hasDuplicatedNum(1111)).isFalse();
    }
}
