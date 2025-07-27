import java.util.Scanner;
public class Evenodd {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter an integer");
int user1 = scanner.nextInt();

System.out.println("Enter another integer");
int user2 = scanner.nextInt();

System.out.println("Enter another integer");
int user3 = scanner.nextInt();

System.out.println("Enter another integer");
int user4 = scanner.nextInt();

System.out.println("Enter another integer");
int user5 = scanner.nextInt();

double even = 0;
double odd = 0;
double odd1 = 0;
double odd2 = 0;
double odd3 = 0;
double odd4 = 0;
double odd5 = 0;
double even1 = 0;
double even2 = 0;
double even3 = 0;
double even4 = 0;
double even5 = 0;

if (user1 % 2 == 0){
even = user1;
even1 = even;
System.out.printf("Even number = %d%n", user1);}
if (user1 % 2 != 0){
odd = user1;
odd1 = odd;   
System.out.printf("Odd number = %d%n", user1);}

if (user2 % 2 == 0){
even = user2;
even2 = even;
System.out.printf("Even number = %d%n", user2);}
if (user2 % 2 != 0){
odd = user2;
odd2 = odd; 
System.out.printf("Odd number = %d%n", user2);}

if (user3 % 2 == 0){
even = user3;
even3 = even;
System.out.printf("Even number = %d%n", user3);}
if (user3 % 2 != 0){
odd = user3;
odd3 = odd; 
System.out.printf("Odd number = %d%n", user3);}

if (user4 % 2 == 0){
even = user4;
even4 = even;
System.out.printf("Even number = %d%n", user4);}
if (user4 % 2 != 0){
odd = user4;
odd4 = odd; 
System.out.printf("Odd number = %d%n", user4);}

if (user5 % 2 == 0){
even = user5;
even5 = even;
System.out.printf("Even number = %d%n", user5);}
if (user5 % 2 != 0){
odd = user5;
odd5 = odd; 
System.out.printf("Odd number = %d%n", user5);}

double sum = even1 + even2 + even3 + even4 + even5;
double sum2 = odd1 + odd2 + odd3 + odd4 + odd5;

System.out.printf("Sum of even numbers = %2f%n", sum);
System.out.printf("Sum of odd numbers = %2f%n", sum2);

}
}




