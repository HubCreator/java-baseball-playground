package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void req1() {
        assertThat("1,2".split(",")).containsExactly("1", "2");
        assertThat("1".split(",")).containsExactly("1");
    }

    @Test
    void req2() {
        String s = "(1,2)";
        assertThat(s.substring(1, s.length() - 1)).isEqualTo("1,2");
    }

    @Test
    void req3() {
        String s = "abc";
        assertThat(s.charAt(1)).isEqualTo('b');
        assertThatThrownBy(() -> s.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
