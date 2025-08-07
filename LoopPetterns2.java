<<<<<<< HEAD

import java.util.Scanner;
public class LoopPetterns2 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

int number = scanner.nextInt();

if (number == 2 || number == 3){
System.out.println("true");
}
int squareRoot =(int) Math.sqrt(number);

for (int i = 2; i <= squareRoot; i++){
if (number == 5){
System.out.println("True");
break;
}
if (squareRoot == 9 || number == 9){
System.out.println("false");
break;}
if (number % 5 == 0 ){
System.out.println("false");
break;
}
if (number %  i == 0){
System.out.println("False");
break;
}else{
System.out.println("true");
break;
}

}
}
}

=======

import java.util.Scanner;
public class LoopPetterns2 {
 public static void main(String[] args) {
    
int space = 10;

while (space >= 1){

int collumn = 0;

while (collumn < space){
System.out.print("*");
collumn++;
}

System.out.println("h");
space--;
}

}
}




>>>>>>> 9ec0d21bf8721757b0ad6ee909cea386530f705b
