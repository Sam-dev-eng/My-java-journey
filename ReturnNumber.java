import java.util.Scanner;
public class ReturnNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

String world = returnWord("b" , "cccccccbde");

}




public static String returnWord(String alpha, String word){


String lower = word.toLowerCase(); 
int lowerCase = (int)word.indexOf(alpha);
int lenght = (int)lower.length();
String result1 = "lower".indexOf(alpha) + "";

if (lowerCase < 0){
System.out.print(word);
}
if (lowerCase >= 0){
String remaining = lower.substring(lowerCase + 1 , lenght);
String remaining2 = lower.substring(0 , lowerCase);
System.out.print(alpha + testUnicode.reverser(remaining2) + remaining);
}
return word;
}
}