import java.util.Arrays;
public class FunctionArray{
public static void main(String[] args){
int [] n = {0,2,3,4,4,4,5,4};

System.out.println(numbers(n , 1));
}

public static int numbers(int []num , int number){
int count = 0;
for (int i = 0; i < num.length; i++){

if (num[i] == number){
count++;
}
}

return count;


}

}