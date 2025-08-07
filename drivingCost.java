<<<<<<< HEAD
import java.util.Scanner;
public class drivingCost{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter Driving Distance");
double x1 = scanner.nextDouble();

System.out.println("Enter Miles per Gallon");
double y1 = scanner.nextDouble();

System.out.println("Enter price per Gallon");
double x2 = scanner.nextDouble();

double cost = x1 * x2 / y1;
System.out.printf("The cost of driving is $%2f", cost);

}
=======
import java.util.Scanner;
public class drivingCost{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter Driving Distance");
double x1 = scanner.nextDouble();

System.out.println("Enter Miles per Gallon");
double y1 = scanner.nextDouble();

System.out.println("Enter price per Gallon");
double x2 = scanner.nextDouble();

double cost = x1 * x2 / y1;
System.out.printf("The cost of driving is $%2f", cost);

}
>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
 }