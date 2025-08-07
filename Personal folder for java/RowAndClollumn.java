import java.util.Arrays;
public class RowAndClollumn{
public static void main(String[] args){
int [][] score = {
{67,89},
{45,90},
{23,78}
};
int largest = score[0][0];
int lowest = score[0][0];
for (int row = 0; row < score.length; row++){

System.out.println(Arrays.toString(score[row]));
for (int column = 0; column < score[row].length; column++){

int current = score[row][column]; 

if (current > largest){
largest = current;

}
if (current < lowest){
lowest = current;

}

}
}
System.out.println(largest);
System.out.println(lowest);
}
	
}