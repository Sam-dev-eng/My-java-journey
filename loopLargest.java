import java.util.Scanner;
public class loopLargest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a number");
int number = scanner.nextInt();

int largest = 0;
 int smallest = 0;
int quit = 0;
int max = number;

do { System.out.println("Enter a number");
  number = scanner.nextInt();


if 
(number > max)
max = number;

largest = max;
smallest = number;



System.out.println("Press 100 to Quit or 1 to continue");
 quit = scanner.nextInt();
   }while (quit != 100);

System.out.printf("The largest is %d%n", largest);
System.out.printf("The smallest is %d%n", smallest);
}
}




