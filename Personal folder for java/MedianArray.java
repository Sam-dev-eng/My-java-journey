import java.util.Arrays;
public class MedianArray {
public static void main(String [] args){
int [] num1 = {1,2,3,5};
int [] num2 = {4,6,7,8,40};
int [] num3 = {19,20,76,22,};
int [] merged = new int[num1.length + num2.length + num3.length];

System.arraycopy(num1 , 0 , merged , 0 , num1.length);
System.arraycopy(num2 , 0 , merged , num1.length, num2.length);
System.arraycopy(num3 , 0 , merged , num1.length + num2.length , num3.length );

Arrays.sort(merged);

if (merged.length % 2 == 0){
double median = (merged.length/2 + merged.length / 2 + 1) / 2.00;
System.out.println(median);
}
else{
System.out.println(merged.length/2 + 1);
}
}
}