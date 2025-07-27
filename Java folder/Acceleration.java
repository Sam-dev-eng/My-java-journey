import java.util.Scanner;
public class Acceleration{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter v1");
int user1 = scanner.nextInt();

System.out.println("Enter v2");
int user2 = scanner.nextInt();

System.out.println("Enter t");
int user3 = scanner.nextInt();

int average = (user1 - user2) / user3;
System.out.printf("Average velocity(a) = %d", average); 
 



}




}