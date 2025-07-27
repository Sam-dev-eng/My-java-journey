import java.util.Scanner;
public class Comparism{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an integer");
double User = scanner.nextDouble();
System.out.println("The square is :");
System.out.println(User * User);
System.out.println("Adding Both The Square And the number :");
//System.out.println(User * User + User); 
double sum = User * User + User;
if (sum > 72){
System.out.print(sum);

System.out.println(":is greater than 72");}
if (sum < 72) {
System.out.print(sum);

System.out.println(":is less than 72");}

if (sum == 72){
System .out.print(sum);
System.out.println(":is equal to 72");
}
if (sum != 72){
System.out.print(sum + ": is not equal to 72");
} 
}
  }
