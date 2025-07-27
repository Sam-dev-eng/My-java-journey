import java.util.Scanner;
public class repeatQuiz{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int number1 = (int) (Math.random()* 10);
int number2 = (int) (Math.random()* 10);


System.out.println("What is " + number1 + "+" + number2);
 int answer = scanner.nextInt();

while (number1 + number2 == answer){
System.out.println("No try again... what is " + number1 + "+" + number2);
int answer1 = scanner.nextInt();
}if (number1 + number2 != answer){
System.out.println("Na now u get am olodo");
}
}
}