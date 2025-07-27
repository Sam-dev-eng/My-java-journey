import java.util.Scanner;
public class Multiples {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
int number = scanner.nextInt();

if (number % 7 == 0 || number % 6 == 0 ){
System.out.printf("This is a multiple of 6 and 7 ");
}else{
System.out.print("This is not a multiple of 6 and 7");
}


}
}