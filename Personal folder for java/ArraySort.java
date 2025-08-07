import java.util.Arrays;
public class ArraySort{

public static void main(String[] args){

int [] num = {40,35,49,57,61,44,100,0,4,1};
//int []another = new int[num.length];

int storeNumber = 0;
for (int i = 0; i < num.length; i++){

for (int j = 0; j < num.length - i - 1 ; j++){

if (num[j] > num[j +1 ]){
storeNumber = num[j];
num[j] = num[j + 1];
num[j + 1] = storeNumber; 
}

}
}
System.out.println(Arrays.toString(num));



}
}