import java.util.Scanner;
public class Energy{ 
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the amount of water");
double user1 = scanner.nextDouble();

System.out.println("Enter the initial temperature");
double user2 = scanner.nextDouble();

System.out.println("Enter the final temperature");
double user3 = scanner.nextDouble();

double energy = user1 * (user3 - user2) * 4184;
System.out.printf("The energy is %3fj", energy  );


}
}