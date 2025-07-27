import java.util.Scanner;
public class Sumdigits {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number between 0 and 1000");
int user = scanner.nextInt();

int digit1 = user % 10;
int digit2 = user / 10;
int digit3 = digit2 % 10;
int digit4 = digit2 / 10;
int digit5 = digit4 % 10;

double digit = digit1 + digit3 + digit5;

System.out.printf("The sum of the Digits is %1f%n", digit);
}
}