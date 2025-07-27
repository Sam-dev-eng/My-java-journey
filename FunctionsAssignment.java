import java.util.Scanner;
public class FunctionsAssignment{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");
int userInput = scanner.nextInt();

int result = EvenOdd(userInput); 



}


public static int EvenOdd(int number){
if (number % 2 == 0){
System.out.printf("True %d is an even number", number);
}else{
System.out.printf("false %d is an odd number", number);
}
return number;
}


}