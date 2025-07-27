import java.util.Scanner;
public class CountingPossitiveAndNegativeNumbers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int positive = 0;
int negative = 0;
int average = 0;
int count = 0;
int number = 1;
while (number != 0){
System.out.println("Enter an integer,input ends if it is 0:");
 number = scanner.nextInt();
average += number;
count++;

if (number > 0){
positive++;
}

if (number < 0){
negative++;
}
}
int totalaverage = average / count;
System.out.printf("Number of positive is %d%n", positive);
System.out.printf("Number of Negative is %d%n", negative);
System.out.printf("And the Average is %d%n ", totalaverage);
System.out.printf("The total is %d%n ", average);


}
}

