import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class validationTest {

    @Test
    @DisplayName("1~9까지의 숫자인지 테스트")
    void validNo() {
        assertThat(ValidationUtils.validNum(0)).isFalse();
        assertThat(ValidationUtils.validNum(1)).isTrue();
        assertThat(ValidationUtils.validNum(9)).isTrue();
        assertThat(ValidationUtils.validNum(10)).isFalse();
    }

    @Test
    @DisplayName("세 자리 숫자")
    void validNums1() {
        assertThat(ValidationUtils.validNums(1)).isFalse();
        assertThat(ValidationUtils.validNums(12)).isFalse();
        assertThat(ValidationUtils.validNums(123)).isTrue();
        assertThat(ValidationUtils.validNums(1234)).isFalse();
    }

    @Test
    @DisplayName("세 자리 숫자, 1-9 범위내에 있는지 확인")
    void validNums2() {
        assertThat(ValidationUtils.validNums(123)).isTrue();
        assertThat(ValidationUtils.validNums(159)).isTrue();
        assertThat(ValidationUtils.validNums(150)).isFalse();
        assertThat(ValidationUtils.validNums(105)).isFalse();
    }

    @Test
    @DisplayName("세 자리 숫자, 1-9 범위내에 있는지 확인, 중복되지 않았는지 확인")
    void validNums3() {
        assertThat(ValidationUtils.validNums(123)).isTrue();
        assertThat(ValidationUtils.validNums(159)).isTrue();
        assertThat(ValidationUtils.validNums(155)).isFalse();
        assertThat(ValidationUtils.validNums(111)).isFalse();
    }

    @Test
    @DisplayName("validation에 허용되는 랜덤 넘버 구하기")
    void validNums4() {
        List<Integer> com = GenerateNums.generateRandNums();
        assertThat(ValidationUtils.validNums(com)).isTrue();
        assertThat(ValidationUtils.validNums(123)).isTrue();
        assertThat(ValidationUtils.validNums(111)).isFalse();
    }
}
