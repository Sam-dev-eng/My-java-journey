import java.util.Arrays;
public class ReverseArray{ 
public static void main(String[] args){


int []arrayNum = {4,5,8,6,4,3,6,6,4,5,8,3,8,5};
int number = 2;

System.out.println(Arrays.toString(returnReverse(arrayNum,number)));

}

public static int[] returnReverse(int [] arrayNum, int number){
int [] newArray = new int[arrayNum.length];

int numCount = 0;
int endCount = 0;
int index = 0;


for (int i = arrayNum.length - 1; i > 0; i--){
numCount = arrayNum[i];
newArray[index++] = numCount;
if (index == number) break;
} 
for (int count = 0; count < arrayNum.length - number; count++){
endCount = arrayNum[count];
newArray[number + count] = endCount;
}
return newArray;
}
}




















/**for (int count = 0; count < arrayNum.length - number; count++){
endCount = arrayNum[count];
newArray[arrayNum.length - number + count] = endCount;
}*/






/**for (; counter < number; counter++){
numCount = arrayNum[arrayNum.length - number + counter];
newArray[counter] = numCount;
}*/
//Arrays.reverse();
