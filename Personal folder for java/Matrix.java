import java.util.Arrays;
public class Matrix{
public static void main(String[] args){

int [][] score = {
{23,34},
{45,89},
{65,50}};

int largest = score[0][0];
int lowest = score[0][0];
int sum = 0;
for (int row = 0; row < score.length; row++){
//System.out.println(Arrays.toString(score[row]));

for (int column = 0; column < score[row].length; column++){
int correct = score[row][column];

if (correct > largest){
largest = correct;
}
if (correct < lowest){
lowest = correct;
}
}


} 

//System.out.println(score[1][1]);
System.out.println(largest);
System.out.println(lowest);
//System.out.println(sum);

}

}