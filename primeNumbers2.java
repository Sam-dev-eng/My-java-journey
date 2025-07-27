import java.util.Scanner;
public class primeNumbers2{
public static void main(String[] Args){
Scanner scanner = new Scanner(System.in);

int number = scanner.nextInt();

 boolean num = PrimeNumber(number);
System.out.println(num);
}
public static boolean PrimeNumber(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}
}