import java.util.Scanner;
public class Number{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Multiple input = new Multiple();
System.out.println("Enter a number");
int number = scanner.nextInt();

int sum = input.multiplication(number);
System.out.println(sum);
 
}
}