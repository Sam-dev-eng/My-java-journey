import java.util.Arrays;


public class StringPalindrom {
    void main(String[] args) {
        int [] num = {3,5,2,7,10};
        System.out.println(Arrays.toString(ArraySumOfSecond(num, 8)));
    }

    public static String reverseString(String word) {
        String line = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char temp = word.charAt(i);
            line += temp;
        }
        return line;
    }





    public static Boolean[] arrayIsPalindrome(String[] str) {

        Boolean[] newArray = new Boolean[str.length];

        for (int count = 0; count <  str.length; count++) {
            newArray[count] = StringPalindrom.reverseString(str[count]).equalsIgnoreCase(str[count]);
        }
        return newArray;
            }


            public static int [] ArraySumOfSecond(int [] numbers, int result){
                int firstNumber = 0;
                int secondNumber = 0;
                for (int count = 0; count < numbers.length; count++){
                   for (int counter = numbers.length -1; counter >= 0; counter--){
                       if (numbers[count] + numbers[counter] == result){
                           firstNumber = numbers[count];
                           secondNumber = numbers[counter];
                           break;
                       }
                   }
                }
                return new int []{firstNumber,secondNumber};
            }

        }





