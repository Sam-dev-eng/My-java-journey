import java.util.Scanner;
public class guessNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Guess a random number from 1-5");

int userInput = 0;
int randomNumber = (int)(Math.random() * 5);


do{
 userInput = scanner.nextInt();


if (userInput > randomNumber){
System.out.println("Too high try again");
}
if (userInput < randomNumber){
System.out.println("Too low try again");
}

}
while (userInput != randomNumber);
 System.out.println("Correct");
 

}
}