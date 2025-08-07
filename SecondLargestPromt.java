import java.util.Scanner;
public class SecondLargestPromt{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int [] score = new int [5];




int secondmax =0;
int largest = 0;




for (int i = 0; i < 5; i++){
score[i] = scanner.nextInt();
if (score[i] > largest){
secondmax = largest;
largest = score[i];
}else
if (score[i] > secondmax && secondmax != largest){
secondmax = score[i];
}


}
System.out.print(largest);
System.out.print("-----" + secondmax);


}


}