import java.util.Arrays;
public class ArrayKata{
public static void main(String[] args){
int [] score = {1,48,12,4,6,7,15};
System.out.println(Arrays.toString(oddNumberInArray(score)));


}
public static int maximumln(int []number){

int result = 0;
int largest = number[0];
for (int count = 0; count < number.length; count++){
result = number[count];

if (result > largest){
largest = result;
}
}
return largest;

}

public static int minimumln(int[]number){

int minimum = number[0];
int result = 0;
for (int count = 0; count < number.length; count++){
result = number[count];

if (result < minimum){
minimum = result;
}

}
return minimum;
 }
public static int sumOfArray(int[] number){

int sum = 0;
for (int count = 0; count < number.length; count++){
sum += number[count];

}
return sum;

}

public static int sumOfEvenNumbers(int [] number){

int num = 0;
int even = 0;
for(int count = 0; count < number.length; count++){
num = number[count];

if (num % 2 == 0){
even += num;
}

}

return even;

}

public static int sumOfOddNumbers(int [] number){

int odd = 0;
int num = 0;
for (int count = 0; count < number.length; count++){
num = number[count];

if (num % 2 != 0){
odd += num;
}

}
return odd;

}

public static int[] arrayOfMaxAndMin(int[] number){


int max = number[0];
int min = number[0];
for (int count = 0; count < number.length; count++){
int result = number[count]; 

if (result > max){
max = result;
}

if (result < min){
min = result;
}
}
int [] merge = {min , max};
return merge;
}

public static int noOfOddNumbers(int[] number){

int num = 0;
int odd = 0;
for (int count = 0; count < number.length; count++){
num = number[count];

if (num % 2 != 0){
odd++;
}

}
return odd;
}

public static int noOfEvenNumbers(int[] number){

int num = 0;
int even = 0;
for (int count = 0; count < number.length; count++){
num = number[count];

if (num % 2 == 0){
even++;
}

}
return even;

}

public static int[] evenNumberInArray(int[] number){
int[] merge = new int[number.length];

int num = 0;
for (int count = 0; count < number.length; count++){
num = number[count];

if (num % 2 == 0){
merge[count] = num;
}
}
return merge;

}
public static int[] oddNumberInArray(int [] number){


//int [] merge = new int[];
int sum = 0;

for (int count = 0; count < number.length; count++){
if (number[count] % 2 != 0){
sum++;


 
// merge[index] = number[count];
}

}
int [] merge = new int[number.length];
int index = 0;

for (int i = 0; i < number.length; i++){
if (number[i] % 2 != 0){
index = i;
merge[index] = number[index];
}
} 



return merge;



}
public static int[] squareNumbers(int [] number){
int [] merge = new int[number.length];

int num = 0;
for (int count = 0; count < number.length; count++){
num = number[count];

merge[count] = num*num; 


}
return merge;



}











}