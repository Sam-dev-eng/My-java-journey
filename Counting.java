import java.util.Scanner;
public class Counting{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
long userInput = scanner.nextLong();

long result = 1;

for (long i = 1; i <= userInput; i++){
if (i % 2 == 0)
result *= i;
}
if (userInput == 0){
System.out.println(0);
}else{
System.out.println(result);
}
}
}


