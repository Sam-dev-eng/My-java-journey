import java.util.Scanner;
public class Years {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of minutes");
int user1 = scanner.nextInt();

int days = user1 / 1440;
int years = days / 365;


System.out.printf("%d minutes is approximately %d years and %d days", user1, years,days);


}
}  