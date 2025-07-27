import java.util.Scanner;
public class ArrayClass{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int[] score = new int[5];

int max = 0;
 int min = 0;
score[0] = scanner.nextInt();


for (int i = 1; i < 5; i++){
score[i] = scanner.nextInt();
if (score[i] > score[0]){
max = score[i];
}else{ max = score[0];
}
if (score[i] < score[0]){
min = score[i];
}else{ min = score[0];
} 
}
int range = max - min;
System.out.println(max);
System.out.println(min);
System.out.println("The range is " + range);
}
}