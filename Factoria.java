<<<<<<< HEAD
import java.util.Scanner;
public class Factoria{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number to find the factoria");
int number = scanner.nextInt();

int result = 1;

while (number >= 1){

 result *= number;
number--;
}

System.out.println(result);

}
=======
import java.util.Scanner;
public class Factoria{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number to find the factoria");
int number = scanner.nextInt();

int result = 1;

while (number >= 1){

 result *= number;
number--;
}

System.out.println(result);

}
>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
}