import java.util.Scanner;
public class noJavaMethod {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a and b");
int number = scanner.nextInt();
int pow = scanner.nextInt();


int result = 1;

 while (pow > 0){
 result = result * number ;

pow--;
}
System.out.println(result);
}
}