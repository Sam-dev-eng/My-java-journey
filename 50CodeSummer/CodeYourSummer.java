import java.util.Scanner;
public class CodeYourSummer{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			//System.out.println("Enter your name");
			//String userInput = scanner.nextLine();	
			System.out.println(EvenOrOdd(5));
	
countingToFive();		
		}  

public static String greetingChooser(String input){
String name = input.toLowerCase();

if (name.equals("alex")){
return "Hello, friend!";
}
else{
 return "Hi, stranger!";
}
}

public static String petChooser(){
Scanner scanner = new Scanner(System.in);
System.out.println("Whats Your type of pet");
String input = scanner.nextLine();
String lowerCase = input.toLowerCase();

if (lowerCase.equals("dog"))
return "Woof! Dogs are awesome!";
else 
return "Cool choice, but I love dogs!";
}


public static String favouriteNumber(){
Scanner scanner = new Scanner(System.in);
System.out.println("Guess a number");
int userInput = scanner.nextInt();

final int FAVORITE_NUMBER = 7;

if (userInput == FAVORITE_NUMBER) return "Thats my favorite number";
else return "Nice Try, Guess Again!"; 


}

public static void countingToFive(){
String numberOne = "Number: 1";
String numberTwo = "Number: 2";
String numberThree = "Number: 3";
String numberFour = "Number: 4";
String numberFive = "Number: 5";

System.out.println(numberOne);
System.out.println(numberTwo);
System.out.println(numberThree);
System.out.println(numberFour);
System.out.println(numberFive);

}

public static String EvenOrOdd(int number){
if (number % 2 == 0) return "Even!";
else return "odd";
}

}