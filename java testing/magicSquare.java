



import java.util.Arrays;
public class magicSquare{
public static void main(String[] args){
    int[][] numbers = {
        {2,3,5}
        
       
    }; 
    System.out.println(magicSquare(numbers));
}
public static boolean magicSquare(int [][] arrays){
    int [][] numbers = arrays;
    int [][] secondNum = arrays;
    int [] row = new int [numbers.length];
    int [] column = new int [numbers[0].length];
    for (int count = 0; count < numbers.length; count++){
        int sum = 0;
        for (int counter = 0; counter < numbers[count].length; counter++){
            sum += numbers[count][counter];
        } 
    row[count] = sum; 
}
     for (int count = 0; count < secondNum[0].length; count++){
              int lower = 0; 
              
                for (int counter = 0; counter < secondNum.length; counter++){
                    lower += secondNum[counter][count];         
                }
         column[count] = lower;
    }

int correct = 0;
for (int count = 0; count < row.length; count++){
if (row[count] == column[count]){
     correct++;
}
}

return correct == row.length || correct == column.length;
}
}

































