import org.example.Calculator;
import org.junit.jupiter.api.*;

/**
 * Unit tests for calculator
 *
 * @author Vinod John
 * @Date 07.01.2024
 */
public class CalculatorTest {
    Calculator calculator;

    @BeforeAll //Executed before all the test cases
    public static void globalSetup() {
        System.out.println("Starting all the tests..");
    }

    @BeforeEach //Executed before every test case
    public void setup() {
        System.out.println("Starting test...");
        calculator = new Calculator();
    }

    @AfterEach //Executed after every test case
    public void finishTest() {
        System.out.println("Test execution done!");
    }

    @AfterAll //Executed after all the test cases
    public static void finishTests() {
        System.out.println("Finished all the tests!");
    }

    @DisplayName("Add two numbers test")
    @Test
    public void whenAddTwoNumbersCalled_shouldReturnValue() {
        float result = calculator.addTwoNumbers(3, 9);
        float result2 = calculator.addTwoNumbers(2.5f, 7.12f);

        float result3 = calculator.addTwoNumbers(4, 7);

        Assertions.assertAll(
                () -> Assertions.assertEquals(12, result),
                () -> Assertions.assertEquals(9.62f, result2)
        );

        Assertions.assertEquals(11, result3);
    }

   // @Disabled
    @Test
    public void whenMultiplyTwoNumbersCalled_shouldReturnValue() {
        float result = calculator.multiplyTwoNumbers(3, 4);

        Assertions.assertTrue(result == 12);
    }
}
