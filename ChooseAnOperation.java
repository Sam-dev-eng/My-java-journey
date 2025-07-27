import java.util.Scanner;
public class ChooseAnOperation{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

String calculation ="""

What type of calculation do u want??

1-> Multiplication
2-> Division
3-> Substraction
4-> Addition
""";
System.out.println(calculation);
int userInput = scanner.nextInt();

switch(userInput){

case 1: String multiplication = """

Welcome to Multiplication table...

""";
System.out.println(multiplication);
System.out.println("Enter the first number");
int number = scanner.nextInt();
System.out.println("Enter the second number");
int number2 = scanner.nextInt();

int result = number * number2;
System.out.println("Your result is " + result);
break;

case 2: String division = """

Welcome to division table...

""";
System.out.println(division);
System.out.println("Enter the first number");
 number = scanner.nextInt();
System.out.println("Enter the second number");
 number2 = scanner.nextInt();

 result = number / number2;
System.out.println("Your result is " + result);
break;

case 3: String substraction = """

Welcome to addition table...

""";
System.out.println(substraction);
System.out.println("Enter the first number");
 number = scanner.nextInt();
System.out.println("Enter the second number");
 number2 = scanner.nextInt();

 result = number + number2;
System.out.println("Your result is " + result);
break;



case 4: String addition = """

Welcome to addition table...

""";
System.out.println(addition);

int right = 0;
int wrong = 0;
int count = 0;



do{
int random = (int)(Math.random() * 50);
int random2 = (int)(Math.random() * 50);
System.out.println(random + " + " + random2);
 number = scanner.nextInt();

int answer = random + random2;
	
if (number == answer){
System.out.println(" You are Right");
right += 1;
}else{
System.out.println(" You are wrong..The right answer is -> " + answer);
wrong += 1;
}
count += 1;
}while (count != 5);
System.out.println("You got " + right + " right " + " and " + wrong + " Wrong ");

}

}
}