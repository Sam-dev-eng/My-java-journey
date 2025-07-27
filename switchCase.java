import java.util.Scanner;
public class switchCase{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your best fruit name");
String userInput = scanner.nextLine();

String fruit = userInput.toLowerCase();

switch (fruit){
case "apple" : System.out.println("Apple is a wonderful fruit with red and green collour");
break;

case "orrange" : System.out.println("Orrange is yellow in color and a nice fruit too");
break;

case "mango" : System.out.println("mango is good for Health I swear to God. LOL");
break;

case "strawberry" : System.out.println("Why u go choose strawberry u dey crase ??");
break;

default : System.out.println("This choice of yours is not in our list for now... U mad man");
break;

}
}
} 

