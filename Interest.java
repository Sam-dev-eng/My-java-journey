import java.util.Scanner;
public class Interest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your balance");
float user1 = scanner.nextFloat();

System.out.println("Enter your Annual interest Rate");
float user2 = scanner.nextFloat();

float interest = user1 * user2 / 1200;
System.out.print("Interest =");
System.out.println(interest + "%"  );

}
 }