import java.util.Scanner;
public class Classwork {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first number:");
int user1 = scanner.nextInt();
System.out.println("Enter second number:");
int user2 = scanner.nextInt();
System.out.println("Enter third number:");
int user3 = scanner.nextInt();
System.out.println("Enter fourth number:");
int user4 = scanner.nextInt();
System.out.println("Enter fifth number:");
int user5 = scanner.nextInt();

int largest = user1;
int secondLargest = Integer.MIN_VALUE;
if (user2 > largest) {
secondLargest = largest;
largest = user2;
}
if (user2 < largest && user2 > secondLargest) {
secondLargest = user2;
}
if (user3 > largest) {
secondLargest = largest;
largest = user3;
}
if (user3 < largest && user3 > secondLargest) {
secondLargest = user3;
}
if (user4 > largest) {
secondLargest = largest;
largest = user4;
}
if (user4 < largest && user4 > secondLargest) {
secondLargest = user4;
}
if (user5 > largest) {
secondLargest = largest;
largest = user5;
}
if (user5 < largest && user5 > secondLargest) {
secondLargest = user5;
}
System.out.println("The highest number is: " + largest);
System.out.println("The second highest number is: " + secondLargest);
}
}
