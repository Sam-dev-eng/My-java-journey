import java.util.Scanner;
public class zeroLoop{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);


int zero = 0;
int positive = 0;
int negative = 0;
int quit = 0;


do { System.out.println("Enter a number");
int number = scanner.nextInt();

if(number > 0)
positive++;

if (number < 0)
negative++;

if (number == 0)
zero++; 

System.out.println("Press 100 to Quit or 1 to continue");
 quit = scanner.nextInt();
   }while (quit != 100);

System.out.printf("There are %d negative numbers\n ", negative);
System.out.printf("There are %d zero numbers\n", zero);
System.out.printf("There are %d positive numbers\n", positive);
}
}




