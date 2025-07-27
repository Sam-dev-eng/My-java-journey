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
}