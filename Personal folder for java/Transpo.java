import java.util.Arrays;
public class Transpo{


public int [][] transposeArray(int [][] arrays){

    int [][] newArray = new int [arrays.length][arrays[0].length];

    int i = 0;
    for (int count = 0; count < arrays[0].length; count++){       
       // System.out.println(arrays[i].length);
        for (int counter = 0; counter < arrays.length; counter++){
         newArray[count][counter] =  arrays[counter][count];

             }   
//        if ( i == arrays.length-1) break;
  //      else i++;
    }
    return newArray;

}

void main(){
    int [][] arr = {{1,5,8},{2,7,2},{2,6,9}};
    System.out.println(Arrays.deepToString(transposeArray(arr)));

}

}







































