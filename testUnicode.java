public class testUnicode{
public static void main(String[] args){

String s1 = "i am coming now";
String s2 = "i am coming now";
String s3 = "i am not coming today";
 //char ch = 'a';
 //System.out.println(++ch);
 char ch = (char)0XAB0041; // The lower 16 bits hex code 0041 is
 // assigned to ch
 System.out.println(ch);

//System.out.println(s1.substring(7 , 10) + " is on his way");
//System.out.print(s1.equals(s2));
String original = "Java";
String reversed = reverser(original);

System.out.println("original "+ original);
System.out.println("reversed "+ reversed);

   int a = (int)"acdebf".indexOf("b");
System.out.println(a);

}
public static String reverser(String str){
String reversed = "";

for (int i = 0; i < str.length(); i++){

reversed = str.charAt(i) + reversed;

} 

return reversed;
}
}