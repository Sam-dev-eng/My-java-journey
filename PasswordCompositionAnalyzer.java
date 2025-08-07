import java.util.Scanner;
public class PasswordCompositionAnalyzer{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String lowerCase;
do{
String password = getPassword();
int[] complexity =checkComplexity(password);
System.out.printf("Alphabetical characters: %d%nNumeric chareacters: %d\n", complexity[1] , complexity[0]);  
String strength = evaluateStrength(complexity[0] , complexity[1]);
System.out.println("Password strength : " + strength);

System.out.println("Try another password?(yes/no):");
String again = scanner.nextLine();
 lowerCase = again.toLowerCase();

}while(!lowerCase.equals("no"));
System.out.println("Goodbye fam");













//int[] count = checkComplexity("gdegfiwu785");

//System.out.println(count[0]);
//System.out.println(evaluateStrength(5,4)); 




//System.out.println(getPassword());

}

public static String getPassword(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a password");
String number = scanner.nextLine();

return number;
}

public static int[] checkComplexity(String password){
int letter = 0;
int digit = 0;
for (int i = 0; i < password.length(); i++){
char count = password.charAt(i);
if (Character.isLetter(count)){
letter++;
}else
if(Character.isDigit(count)){
digit++;
}
}
return new int[]{digit , letter};

}


public static String evaluateStrength(int digit , int letter){
int totalCount = digit + letter;

if (totalCount <= 5 && digit > 0){
  return "Weak";
}else
if (totalCount <= 5 || totalCount <= 8 &&  digit > 1){
 return "Moderate";
}else
if (totalCount >= 9 && digit >= 2){
    return "Strong"; 
}else{ 
   return "At least 4 numeric characters and 4 Alpha numeric characters"; 
}

}


}







