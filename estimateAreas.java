import java.util.Scanner;
public class estimateAreas{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter The Sides");
Double number = scanner.nextDouble();

Double Area = (6 * (number * number)) / (4 * Math.tan(Math.PI / 6));

System.out.printf("The area of the hexagon is %4f%n", Area);
System.out.println("Positive/tNegateive/tNegative"); 


}

}