import java.util.Scanner;
public class vowelpick{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a letter");
String later = scanner.nextLine();
String lower = later.toLowerCase();

int count = 0;
for (int i = 0; i < lower.length(); i++){
char length = lower.charAt(i);

if (length == 'a' || length == 'e'|| length == 'i' || length == 'o' || length == 'u')
//System.out.println(length); 
count++; 



}
System.out.println("Number of vowels are " + count); 




}



}