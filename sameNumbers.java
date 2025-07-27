import java.util.Scanner;
public class sameNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter three numbers");
int user = scanner.nextInt();

int digit1 = user % 10;
int division1 = user / 10;
int digit2 = division1 % 10;
int division2 = division1 / 10;
int digit3 = division2 % 10;
int division3 = division2 / 10;
int digit4 = division3 % 10;


int  number1= user % 10;
int divide1 = user / 10;
int number2 = divide1 % 10;
int divide2 = divide1 / 10;
int number3 = divide2 % 10;
int divide3 = divide2 / 10;
int number4 = divide3 % 10;
 

if (digit1 == number4 && digit2 == number3 && digit2 == number3 && number1 == digit4){
System.out.print("Input is true");


} else{
System.out.print("Input is false");
 
}
}
}