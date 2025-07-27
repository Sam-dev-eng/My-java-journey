import java.util.Scanner;
public class Converter{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number in pounds");
float user1 = scanner.nextFloat();

double pounds = user1 * 0.454;
System.out.printf("%s pounds is %s kilograms", user1, pounds);

}
}  