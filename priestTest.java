<<<<<<< HEAD
import java.util.Scanner;
public class priestTest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter 5 integers");
int number = scanner.nextInt();

int largest = number;
int count = 0;

while( count <= 3){
count =  count + 1;
System.out.println("Enter another number");
int number2 = scanner.nextInt();

if (largest > count){
largest = largest;
if (largest < count){
largest = count;
}
}
}
System.out.println(largest); 





}
=======
import java.util.Scanner;
public class priestTest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter 5 integers");
int number = scanner.nextInt();

int largest = number;
int count = 0;

while( count <= 3){
count =  count + 1;
System.out.println("Enter another number");
int number2 = scanner.nextInt();

if (largest > count){
largest = largest;
if (largest < count){
largest = count;
}
}
}
System.out.println(largest); 





}
>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
} 