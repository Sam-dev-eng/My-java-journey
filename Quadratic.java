import java.util.Scanner;
public class Quadratic {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter A");
double firstnumber = scanner.nextDouble();

System.out.println("Enter B");
double secondnumber = scanner.nextDouble();

System.out.println("Enter C");
double thirdnumber = scanner.nextDouble();

double numarators = (secondnumber * secondnumber) - 4 * firstnumber * thirdnumber;

double quadequation = ( -secondnumber + Math.sqrt(numarators)) / (2 * firstnumber);
double quadequation2 = ( -secondnumber - Math.sqrt(numarators)) / (2 * firstnumber);

if (numarators >= 0) {
System.out.printf("The first root is %f%n", quadequation);
System.out.printf("The second root is %f%n", quadequation2);
}
else {

System.out.println("There is no root");
}



}
}

