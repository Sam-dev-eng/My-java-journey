<<<<<<< HEAD
import java.util.Scanner;
public class geometryPentagon{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the lenght of the center of a triangle");
double number = scanner.nextDouble();


double s = 2 * number * Math.sin(Math.PI / 5);
double Area = (5 * (s * s)) / (4 *( Math.tan(Math.PI / 5)));

System.out.printf("Area of the pentagon is %3f", Area);



}


=======
import java.util.Scanner;
public class geometryPentagon{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the lenght of the center of a triangle");
double number = scanner.nextDouble();


double s = 2 * number * Math.sin(Math.PI / 5);
double Area = (5 * (s * s)) / (4 *( Math.tan(Math.PI / 5)));

System.out.printf("Area of the pentagon is %3f", Area);



}


>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
}