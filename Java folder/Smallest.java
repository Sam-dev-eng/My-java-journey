import java.util.Scanner;
public class Smallest{ 
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter an integer");
long user1 = scanner.nextInt();

System.out.println("Enter another integer");
long user2 = scanner.nextInt();

System.out.println("Enter the last number");
long user3 = scanner.nextInt();

long sum = user1 + user2 + user3;
System.out.printf("sum is %d%n", sum);

long Average = (user1 + user2 + user3) / 3;
System.out.printf("Average is %d%n", Average);

long product = user1 * user2 * user3;
System.out.printf("Product is %d%n", product);

long largest = user1;
if(user2 > largest){
largest = user2;}
if (user2 < largest){
largest = largest;} 

if (user3 > largest){
largest = user3 ;}

if (user3 < largest){
largest = largest;}
System.out.printf("largest = %d%n", largest);




}

}