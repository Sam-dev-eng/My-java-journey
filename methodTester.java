<<<<<<< HEAD
import java.util.Scanner;
public class methodTester{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);


System.out.println("input a Month, a Day, and a Year 'Respectively'!");
String month = scanner.next();
int day = scanner.nextInt();
int year = scanner.nextInt();

String result = Remain.remainder(month, day, year);

System.out.println(result);

}
=======
import java.util.Scanner;
public class methodTester{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Remain input = new Remain();

System.out.println("input a Month, a Day, and a Year 'Respectively'!");
String month = scanner.next();
int day = scanner.nextInt();
int year = scanner.nextInt();

String result = input.remainder(month, day, year);

System.out.println(result);

}
>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
}