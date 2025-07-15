public class Maths{
 public static void main(String[] args){
int result = paddition(5 , 5);
int result2 = multiplication(5 , 5);
int result3 = division(5 , 5);
int result4 = substraction(6 , 3);
System.out.printf("%d %n %d %n", result2 , result3 , result4 , result);

}
public static int paddition(int 1number, int 2number){
int sum = 1number + 2number;
return sum;
}
public static int multiplication(int numberTwo, int numberOne){
int times = numberOne * numberTwo;
return times;
}
public static int division(int number1, int number2){
int divide = number1 / number2;
return divide;
}
public static int substraction(int num1 , int num2){
int sub = num1 - num2;
return sub;

}
} 