import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Declare the calculator, but don't initialize here
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Initialize the calculator before each test
        calculator = Calculator.getInstance();
    }

    // Utility method to simulate button presses
    private void pressButtons(String... buttons) {
        for (String button : buttons) {
            calculator.processButton(button);
        }
    }

    @Test
    public void testAddition() {
        pressButtons("1", "+", "1", "=");
        Assertions.assertEquals("2", calculator.display.getText());

        pressButtons("1", "0", "0", "+", "2", "0", "0", "=");
        Assertions.assertEquals("300", calculator.display.getText());
    }

    @Test
    public void testSubtraction() {
        pressButtons("5", "–", "3", "=");
        Assertions.assertEquals("2", calculator.display.getText());
    }

    @Test
    public void testMultiplication() {
        pressButtons("5", "×", "2", "=");
        Assertions.assertEquals("10", calculator.display.getText());
    }

    @Test
    public void testDivision() {
        pressButtons("9", "÷", "3", "=");
        Assertions.assertEquals("3", calculator.display.getText());
    }

    @Test
    public void testSquareRoot() {
        pressButtons("9", "√x");
        Assertions.assertEquals("3", calculator.display.getText());
    }

    @Test
    public void testDecimals() {
        pressButtons("0", ".", "5", "×", "2", "=");
        Assertions.assertEquals("1", calculator.display.getText());
    }

    @Test
    public void testSquare() {
        pressButtons("3", "x^2");
        Assertions.assertEquals("9", calculator.display.getText());
    }

    @Test
    public void testMultipleOperations() {
        pressButtons("3", "+", "5", "=", "×", "2", "=");
        Assertions.assertEquals("16", calculator.display.getText());
    }

    @Test
    public void testReset() {
        pressButtons("1", "+", "1", "AC");
        Assertions.assertEquals("0", calculator.display.getText());
    }

    @Test
    public void testReciprocal() {
        pressButtons("4", "1/x");
        Assertions.assertEquals("0.25", calculator.display.getText());
    }

    @Test
    public void testNegativeNumbers() {
        pressButtons("5", "–", "7", "=");
        Assertions.assertEquals("-2", calculator.display.getText());
    }

}
