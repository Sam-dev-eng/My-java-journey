import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//javac -cp junit-platform-console-standalone-1.9.2.jar Calculator.java CalculatorTester.java
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTester

public class CalculatorTester{


@Test
public void testForMultplication(){

//Arrange
int firstNumber = 5;
int secondNumber = 4;
//Act
Calculator calculator = new Calculator();
int result = calculator.multiply(firstNumber, secondNumber);
//Assert

assertEquals(result , 20);


}
@Test
public void testForAddition(){

//Arrange 
int firstNumber = 6;
int secondNumber = 3;

//Act
Calculator calculator = new Calculator();
int result = calculator.division(firstNumber,secondNumber);

//Assert
assertEquals(result , 2);


}
@Test
public void testForNegativeDivision(){

//Arrange 
int firstNumber = -6;
int secondNumber = -3;

//Act
Calculator calculator = new Calculator();
int result = calculator.division(firstNumber,secondNumber);

//Assert
assertEquals(result , 0);


}















}