import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AgeCalculatorTest{





@Test 
public void  testIfItReturnsTheLargestAndSecondLargest(){

//Arrange
int [] Age = {1,5,87,45,8,8};
//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Age);
//Assert 
assertArrayEquals(result , new int[]{45,87});

}

@Test
public void testFordifferentNumber(){

//Arrange
int [] Ages = {1,5,7,9,3,5,2,8};
//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Ages);
//Assert
assertArrayEquals(result,new int[]{8,9});
}

public void testForNegativeNumbers(){

//Arrange
int [] Ages = {-1,-2,-3,-9,-6,8};

//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Ages);

//Assert
assertArrayEquals(result,new int[] {-1,8});

}

@Test
public void  testIfitReturnsZeroIfTheParametersAreEmpty(){

//Arrange
int [] Age = {};
//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Age);
//Assert 
assertArrayEquals(result , new int[]{0,0});

}

@Test
public void  testIfTheUserInputsOnlyOneNumber(){

//Arrange
int [] Age = {1};
//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Age);
//Assert 
assertArrayEquals(result , new int[]{1});

}

@Test
public void  testIfitReturnsZeroIfTheParametersAreZero(){

//Arrange
int [] Age = {0,0,0,0,0,0,0,0};
//Act
AgeCalculator age = new AgeCalculator();
int [] result = age.OldestAge(Age);
//Assert 
assertArrayEquals(result , new int[]{0,0});

}















}