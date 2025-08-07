<<<<<<< HEAD
import java.util.Scanner;
public class Numbers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
int user1 = scanner.nextInt();

System.out.println("Enter another number");
int user2 = scanner.nextInt();

System.out.println("Enter another number");
int user3 = scanner.nextInt();

System.out.println("Enter another number");
int user4 = scanner.nextInt();

System.out.println("Enter another number");
int user5 = scanner.nextInt();

int largest = 0;
int lowest = user5;



if (user1 > user2){
largest = user1;}
if (user1 < user2){
largest = user2;}

if (user1 > user3){
largest = user1;}
if (user1 < user3){
largest = user3;}

if (user1 > user4){
largest = user1;}
if (user1 < user4){
largest = user4;}

if (user1 > user5){
largest = user1;}
if (user1 < user5){
largest = user5;}

if (user1 > user2){
lowest = user2;}
if (user1 < user2){
lowest = user1;}

if (user1 > user3){
lowest = user3;}
if (user1 < user3){
lowest = user1;}

if (user1 > user4){
lowest = user4;}
if (user1 < user4){
lowest = user1;}

if (user1 > user5){
lowest = user5;}
if (user1 < user5){
lowest = user1;}



System.out.printf("Largest = %d%n", largest);

System.out.printf("Lowest = %d%n", lowest);
}

=======
import java.util.Scanner;
public class Numbers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
int user1 = scanner.nextInt();

System.out.println("Enter another number");
int user2 = scanner.nextInt();

System.out.println("Enter another number");
int user3 = scanner.nextInt();

System.out.println("Enter another number");
int user4 = scanner.nextInt();

System.out.println("Enter another number");
int user5 = scanner.nextInt();

int largest = 0;
int lowest = user5;



if (user1 > user2){
largest = user1;}
if (user1 < user2){
largest = user2;}

if (user1 > user3){
largest = user1;}
if (user1 < user3){
largest = user3;}

if (user1 > user4){
largest = user1;}
if (user1 < user4){
largest = user4;}

if (user1 > user5){
largest = user1;}
if (user1 < user5){
largest = user5;}

if (user1 > user2){
lowest = user2;}
if (user1 < user2){
lowest = user1;}

if (user1 > user3){
lowest = user3;}
if (user1 < user3){
lowest = user1;}

if (user1 > user4){
lowest = user4;}
if (user1 < user4){
lowest = user1;}

if (user1 > user5){
lowest = user5;}
if (user1 < user5){
lowest = user1;}



System.out.printf("Largest = %d%n", largest);

System.out.printf("Lowest = %d%n", lowest);
}

>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
}