import java.util.Scanner;
public class Investment {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter investment amount");
float user1 = scanner.nextFloat();

System.out.println("Enter annual interest rate in percentage");
float user2 = scanner.nextFloat();

System.out.println("Enter the number of years");
float user3 = scanner.nextFloat();

float monthlyrate = user2 / (100 * 12);
float firstmonth = 1 + monthlyrate;
float secondmonth = firstmonth *  firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth * firstmonth;

float investment = user1 * secondmonth;
System.out.printf("Accumulated value is $%f", investment);

}
}
 