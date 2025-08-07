<<<<<<< HEAD
import java.util.Scanner;
public class Runway {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter speed");
float user1 = scanner.nextFloat();

System.out.println("Enter acceleration");
float user2 = scanner.nextFloat();

float speed = user1 * user1;
float acceleration =  speed / (user2 * 2);

System.out.printf("The minimum runway lenght for this airplane is %3f%n", acceleration);

}
=======
import java.util.Scanner;
public class Runway {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter speed");
float user1 = scanner.nextFloat();

System.out.println("Enter acceleration");
float user2 = scanner.nextFloat();

float speed = user1 * user1;
float acceleration =  speed / (user2 * 2);

System.out.printf("The minimum runway lenght for this airplane is %3f%n", acceleration);

}
>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
}