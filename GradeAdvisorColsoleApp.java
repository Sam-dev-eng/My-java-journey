import java.util.Scanner;
public class GradeAdvisorColsoleApp{
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);

String back;
do {
int score = getScore();
String grade = calculateGrade(score);
System.out.println("Your Grade is : " + grade);
String feedback = getFeedback(grade);

System.out.println("Try another score ? (yes/no):");
 back = scanner.nextLine();
 
}while (!back.toLowerCase().equals("no"));
System.out.println("Good bye fam");







}
public static int getScore(){
Scanner scanner = new Scanner(System.in);
int score;
do{
System.out.println("Enter your score");
 score = scanner.nextInt();
if (score < 0 || score > 100)
System.out.println("Invalid try again");

}while (score < 0 || score > 100);
  
return score;
}

public static String calculateGrade(int number){
String grade; 
if (number >= 80){
grade = "A"; 
}else
if (number >= 60){
grade = "B";
}else
if (number >= 40){
grade = "C";
}else
if (number >= 20){
grade = "D";
}else{
grade = "F";
}
return grade;
}


public static String getFeedback(String grade){
if (grade.equals("A")){
System.out.println("Excellent performance");
}else
if (grade.equals("B")){
System.out.println("Good job, Keep improving");
}else
if (grade.equals("C")){
System.out.println("Fair effort, keep working on it");
} else
if (grade.equals("D")){
System.out.println("You can do better, don't give up");
}else {
System.out.println("Needs improvement, Ask for help");
}
return grade;
}









}