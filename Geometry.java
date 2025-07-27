import java.util.Scanner;
public class Geometry{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter (x1)");
double x1 = scanner.nextDouble();

System.out.println("Enter (y1)");
double y1 = scanner.nextDouble();

System.out.println("Enter (x2)");
double x2 = scanner.nextDouble();

System.out.println("Enter (y2)");
double y2 = scanner.nextDouble();

System.out.println("Enter (x3)");
double x3 = scanner.nextDouble();

System.out.println("Enter (y3)");
double y3 = scanner.nextDouble();

double here = (x2 - x1) * (x2 - x1);
double side = (here + (y2 - y1) * (y2 - y1));
double p = side / 2;
double o = p + side / 2;
double i = o / 2;
double side1 = i + o / 2;

double another = (x3 - x2) * (x3 - x2);
double one = (another + (y3 - y2) * (y3 - y2));
double is = one / 2;
double coming = one + is / 2;
double soon = coming / 2;
double side2 = soon + coming / 2;

double just = (x1 - x3) * (x1 - x3);
double get = (just + (y1 - y3) * (y1 - y3));
double ready = get / 2;
double form = ready + get / 2;
double it = form/ 2;
double side3 = it + form / 2;

double s = (side1 + side2 + side3) / 2;
System.out.printf("S = %f%n", s);

double area = s * (s - side1) * (s - side2) * (s - side3);

double result = area / 2;
double answer = result + area / 2;
double semi = answer / 2;
double f = semi + answer / 2;  
System.out.printf("Area = %f%n", f);





}



}