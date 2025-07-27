import java.util.Scanner;
public class mathsQuiz {
public static void main(String[] args) {

int number1 = (int)(Math.random() * 100);
int number2 = (int)(Math.random() * 100);

if (number1 < number2){
number2 =  number1;
number1 = number2;
}
Scanner scanner = new Scanner(System.in);

System.out.println("what is " + number1 + "-" + number2);
int result = scanner.nextInt();

if (number1 - number2 == result){
System.out.println("You are correct");
}else{
System.out.print(number1 - number2 + " is the answer mumu");
}
}
}

