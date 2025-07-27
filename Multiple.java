public class Multiple{
public static void main(String[] args){
int age = multiplication(5);
System.out.print(age); 




}
public static int multiplication(int x){
if (x % 2 == 0){
x = x * x;
}else{
x = x - 1;}
return x;

}
}
