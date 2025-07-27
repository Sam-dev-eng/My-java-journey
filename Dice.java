import java.util.Scanner;
public class Dice {
public static void main(String[] args) {

int randomNumber = (int)(Math.random() * 2);

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a random number from 0 - 1");
int userInput = scanner.nextInt();

int guess = randomNumber + userInput;

switch (guess){
case 2 : System.out.print(randomNumber == 1) ? "You are lucky its a head" : "You are Lucky its a tail);
break;

case 1 : System.out.println("Try One More Time");
int userInput2 = scanner.nextInt();

if (randomNumber == userInput2){
System.out.println((randomNumber == 1) ? "Head you are Lucky" : "tail you are lucky");

}else if(randomNumber != userInput2 && userInput2 <= 1){
System.out.println("Not lucky This time");
}else{
System.out.print("invalid Input");}
break;

case 0 : System.out.print("Nice You guessed Right its a tail");
break;

default : System.out.print("Invalid Input");
break;



}
}
}


