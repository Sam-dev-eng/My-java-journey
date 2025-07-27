import java.util.Scanner;
public class Converter{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number in pounds");
double user1 = scanner.nextDouble();

double pounds = user1 * 0.454;
System.out.printf("%f%s pounds is %f%s kilograms", user1, pounds);

}
}  