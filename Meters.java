import java.util.Scanner;
public class Meters{ 
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a value for feet");
double user1 = scanner.nextDouble();

double meters = user1 * 0.3048;
System.out.printf("%3f feets is %3f meters", user1,meters);  

}
}
