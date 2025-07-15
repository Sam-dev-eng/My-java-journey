import java.util.Scanner;
public class Aritmetic{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an integer");
int User = scanner.nextInt();
System.out.println("Enter another integer");
int User2 = scanner.nextInt();
System.out.println("The square are:");
System.out.println(User * User);
System.out.println(User2 * User2); 
System.out.println("Sum of their squares are:");
System.out.println(User * User + User2 * User2);
System.out.println("The differences are :");
System.out.println(User * User - User2 * User2); 


}


}