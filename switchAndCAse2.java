import java.util.Scanner;
public class switchAndCAse2 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int userInput = scanner.nextInt();
switchprocess(userInput);


}

public static int switchprocess(int x){

switch(x){
case 1: System.out.print("I AM not COMING");

break;
case 2: System.out.print("I AM in COMING");
break;
case 3: System.out.print("I AM on COMING");
break;
case 4: System.out.print("I AM if COMING");
break;
case 5: System.out.print("I AM  COMING");
break;
}
return x; 

}



 
}