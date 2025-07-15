import java.util.Scanner;
public class naturalNumbers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
int number1 = scanner.nextInt();
int sum = 0;
while (number1 <= 10) {
 sum  += number1;
System.out.println("for " + number1 +" The sum is " + sum);
System.out.println();
number1++;
}









}
}