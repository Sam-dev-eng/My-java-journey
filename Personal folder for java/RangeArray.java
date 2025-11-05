
import MySet.MySet;
import java.util.Arrays;
public class RangeArray {

    void main(){
        int [] number = {-10,10,6};
        System.out.println(Arrays.toString(range(number)));
    }


    public  int[] range(int [] numbers){
        MySet numberSet = new MySet();
        int largest = numbers[0];
        int lowest = numbers[0];
      for(int number : numbers){
          if (number > largest){
            largest = number;
          }
          if (number < lowest){
              lowest = number;
          }
      }


          for (int counter = lowest; counter < largest; counter++) {
              for (int index = 0; index < numbers.length; index++) {
                  if (!isAvailable( numbers, counter)) {
                     numberSet.add(counter);
                  }
              }
          }
          int [] newArray = new int[numberSet.size()];
          for (int index = 0; index < newArray.length; index++) {
              newArray[index] = (int) numberSet.get(index);
          }
      return newArray;
    }

    public boolean isAvailable(int [] num1 , int num2){

        for (int count = 0;  count < num1.length; count++){
            for (int index = 0; index < num1.length; index++){
                if (num1[count] == num2){
                    return true;
                }
            }
        }
        return false;
    }
}
