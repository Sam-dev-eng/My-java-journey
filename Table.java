import java.util.Scanner;
public class Table {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a and b");
int numberOne = scanner.nextInt();
int pow1 = scanner.nextInt();

System.out.println("Enter a and b");
int numberTwo = scanner.nextInt();
int pow2 = scanner.nextInt();

System.out.println("Enter a and b");
int numberThree = scanner.nextInt();
int pow3 = scanner.nextInt();

System.out.println("Enter a and b");
int numberFour = scanner.nextInt();
int pow4 = scanner.nextInt();

System.out.println("Enter a and b");
int numberFive= scanner.nextInt();
int pow5 = scanner.nextInt();


int result1 = (int)Math.pow(numberOne , pow1);
int result2 = (int)Math.pow(numberTwo , pow2);
int result3 = (int)Math.pow(numberThree , pow3);
int result4 = (int)Math.pow(numberFour, pow4);
int result5 = (int)Math.pow(numberFive , pow5);


System.out.println("a\tb\tpow(a , b)\t");
System.out.printf("%d\t%d\t%d\n", numberOne , pow1 , result1);
System.out.printf("%d\t%d\t%d\n", numberTwo , pow2 , result2);
System.out.printf("%d\t%d\t%d\n", numberThree , pow3 , result3);
System.out.printf("%d\t%d\t%d\n", numberFour , pow4 , result4);
System.out.printf("%d\t%d\t%d\n", numberFive , pow5 , result5);
}
}




