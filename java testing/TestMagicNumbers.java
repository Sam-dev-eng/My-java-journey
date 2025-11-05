

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMagicNumbers{

@Test 
public void testIfMyFunctionReturnsFalseIfTheresNoMagicNumbers(){

int [][] numbers = {
{1,3,6},{3,5,6},{3,7,2}
};
assertFalse(magicSquare.magicSquare(numbers));
}

@Test 
public void testIfMyFunctionWillReturnTrue(){
  
  int [][] numbers ={
  {2,3,5},{4,5,1},{4,2,4}
  };
  assertTrue(magicSquare.magicSquare(numbers));

}

}
