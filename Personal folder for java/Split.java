import java.util.Arrays;
public class Split{
public static void main (String[] args){


String word = "Jesus is Lord";

System.out.println(Arrays.toString(splitFunction(word)));

} 
public static String[] splitFunction(String words){

String[] split = words.split(" ");
return split;
}





}