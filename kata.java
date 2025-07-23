import java.util.Scanner;
public class kata{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");


int userInput = scanner.nextInt();
//int userInput2 = scanner.nextInt();
boolean result = PrimeNumber(userInput); 

System.out.print(result);

}


public static int EvenOdd(int number){
if (number % 2 == 0){
System.out.printf("True %d is an even number", number);
}else{
System.out.printf("false %d is an odd number", number);
}
return number;

}
public static int PossitiveDifference(int numberOne, int numberTwo ){
int sub = 0;
if (numberOne < numberTwo){
 sub = numberTwo - numberOne;
System.out.printf("The answer is %d", sub);
 }else{
 sub = numberOne - numberTwo;
System.out.printf("The answer is %d", sub);
} 
return sub;
}

public static float Quotent(float firstNumber, float secondNumber){
float quotent = firstNumber / secondNumber;
if (secondNumber == 0){
quotent = 0;
}
return quotent;
}

public static int factors(int number){
int factor = 0;
for (int j = number; j > 0; j--){
if (number % j == 0){
factor++;
}
}
return factor;

}

public static float SquareRoot(float number){
float result = (float) Math.sqrt(number);
if (number % result == 0){
System.out.println("True");
}
else{ 
System.out.println("False");
}
return number;
}



public static boolean PrimeNumber(int number) {
 if (number <= 1) return false;
 if (number == 2) return true;
 if (number % 2 == 0) return false;

 for (int i = 3; i <= Math.sqrt(number); i += 2) {
 if (number % i == 0) return false;
 }
return true;
}




public static boolean pendulum(int number){
int reversed = 0;
int original = number;
while (number != 0){

reversed = reversed * 10 + number % 10;

number = number / 10;
}
if (reversed == original) return true;
return false;
}


}