import java.util.Scanner;
public class CodeSummer2{
public static void main(String [] args){

System.out.println(passwordChecker());


}
public static void multipleOfThree(){

int multiple = 3;
for (int count = 1; count < 16; count++){
	if (count % 3 == 0) 
	System.out.print(" "+count);


}
}
public static String passwordChecker(){
Scanner scanner = new Scanner(System.in);

final String PASSWORD = "secret123";
System.out.println("Type a Password");
String userInput = scanner.nextLine();

if (userInput.equals(PASSWORD)){
return "Access granted!";
}
	else{
		return "Access denied";

}
}
















}