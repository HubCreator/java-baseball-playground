import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationTest {

    @Test
    void rangeTest() {
        assertThat(ValidationUtil.isValidInput(1)).isTrue();
        assertThat(ValidationUtil.isValidInput(0)).isFalse();
        assertThat(ValidationUtil.isValidInput(9)).isTrue();
        assertThat(ValidationUtil.isValidInput(10)).isFalse();
    }

    @Test
    void threeNumTest() {
        assertThat(ValidationUtil.isSizeOfThree(123)).isTrue();
        assertThat(ValidationUtil.isSizeOfThree(12)).isFalse();
        assertThat(ValidationUtil.isSizeOfThree(1234)).isFalse();
    }
}
