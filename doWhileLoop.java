import java.util.Scanner;
public class doWhileLoop{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int sum;
int quit;
do {
System.out.println("Enter a number");
int number1 = scanner.nextInt();

System.out.println("Enter another number");
int number2 = scanner.nextInt();

 sum = number1 + number2; 
System.out.println(" The sum is " + sum);

System.out.println("Press 1 to quit or any number to continue");
quit = scanner.nextInt();

}

while (quit != 1);
System.out.println("Goodbye fam");


}


}