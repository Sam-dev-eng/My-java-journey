import java.util.Scanner;
public class Month{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter month");
String userInput1 = scanner.nextLine();
System.out.println("Enter a day in numbers");
int days = scanner.nextInt();

String month = userInput1.toLowerCase();
int january1 = 31;
int febuary1 = 28;
int march1 = 31;
int april1 = 30;
int may1 = 31;
int june1 = 30;
int july1 = 31;
int august1 = 31;
int september1 = 30;
int october1 = 31;
int november1 = 30;
int december1 = 31;

switch(month){
case "january" : System.out.println("its remaining " + (january1 - days));
break;

case "febuary" : System.out.println("Its remaining " + (febuary1 - days)); 
break;
case "march" : System.out.println("its reamining " + (march1 - days));
break;

case "april" : System.out.println("Its remaining " + (april1 - days));
break;

case "may" : System.out.println("its remaining " + (may1 - days));
break;

case "june" : System.out.println("its remaining " + (june1 - days));
break;

case "july" : System.out.println("its remaining " + (july1 - days));
break;

case "august" : System.out.println("its remaining " + (august1 - days));
break;

case "september" : System.out.println("its remaining " + (september1 - days));
break;

case "october" : System.out.println("its remaining " + (october1 - days));
break;

case "november" : System.out.println("its remaining " + (november1 - days));
break;

case "december" : System.out.println("its remaining " + (december1 - days));
break;

default : System.out.println("Invalid input");
break;
}
}
}