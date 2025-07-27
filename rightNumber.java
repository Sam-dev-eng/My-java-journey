import java.util.Scanner;
public class rightNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Guess a random number from 1-5");

int userInput = 0;
int randomNumber = (int)(Math.random() * 5);

do {

userInput = scanner.nextInt();
if (userInput > randomNumber ){

System.out.println("Too high");
}

if (userInput < randomNumber){
 System.out.println("Too low");
}

}while (randomNumber != userInput);
       System.out.println("Congrats");






}
}