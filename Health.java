import java.util.Scanner;
public class Health{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your Weight");
float user1 = scanner.nextFloat();

System.out.println("Enter your Height");
float user2 = scanner.nextFloat();

float height = user2 * user2;
float bmi = height / user1; 

System.out.printf("BMI is %f%n", bmi);





}



}