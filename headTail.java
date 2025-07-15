import java.util.Scanner;
public class headTail {
public static void main(String[] args) {

int randomNumber = (int)(Math.random() * 2);

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a random number from 0 - 1");
int userinput = scanner.nextInt();



if (randomNumber == userinput) {
System.out.print((randomNumber == 1) ? "Head you are lucky" : "tail you are lucky");

}else if (randomNumber != userinput && userinput <= 1){

System.out.println("Try One More Time");
int userInput2 = scanner.nextInt();

if (randomNumber == userInput2){
System.out.println((randomNumber == 1) ? "Head you are Lucky" : "tail you are lucky");

}else if(randomNumber != userInput2 && userInput2 <= 1){
System.out.println("Not lucky This time");

}else{
System.out.print("invalid Input");
}
}
}
}
 