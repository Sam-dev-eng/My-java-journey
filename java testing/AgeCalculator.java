import java.util.Arrays;
public class AgeCalculator{


public int[] OldestAge(int[]number){
if (number.length == 0) return new int[]{0,0};
if (number.length == 1) return new int[]{number[0]};

Arrays.sort(number);
int max = number[number.length - 1];
int secondMax = number[number.length - 2];
 
return new int[]{secondMax,max}; 
}




}