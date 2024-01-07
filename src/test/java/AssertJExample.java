import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Vinod John
 * @Date 07.01.2024
 */
public class AssertJExample {

    @Test
    public void stringTest1() {
        String str = "I'm a Java Developer";

        Assertions.assertThat(str)
                .contains("Java")
                .isNotEmpty()
                .doesNotStartWith("A")
                .endsWith("r");
    }
}
