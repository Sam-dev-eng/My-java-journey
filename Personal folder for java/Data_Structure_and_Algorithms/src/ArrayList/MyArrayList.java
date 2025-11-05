package ArrayList;
import java.util.Arrays;



public class  MyArrayList {
    private int count = 0;
     static int lengthCounter  = 2;
    protected  Object[] array = new Object[lengthCounter];

    public boolean isEmpty() {
        return count == 0;
    }

    public Object remove(int number) {
        if (array.length  == count) {
            resizeArray(array.length * 2);
        }
        if (number <= count && number >= 0) {
            Object initialValue = array[number];
            replaceIndex(number);
            count--;
            return initialValue;
        }

        return null;
    }

    public boolean remove(Object name) {
        for (int counter = 0; counter < array.length; counter++) {
            if (name.equals(array[counter])) {
                replaceIndex(counter);
                count--;
                return true;
            }
        }
        return false;
    }

    public  int  size() {
        return count;
    }

    public int indexOf(Object element) {
        for(int  counter = 0; counter < array.length; counter++){
            if(element.equals(array[counter])){
               return counter;
            }
        }
        return -1;
    }

    public Object get(int index) {

        if (index >= 0 && index <= count) {
            return array[index];
        }
        return "Invalid index";
    }


    public boolean add(Object element) {

        if (array.length  == count) {
            resizeArray(array.length * 2);
        }
        array[count++] = element;
        return true;
    }
    public void add(int index, Object element) {
        if (array.length  == count) {
            resizeArray(array.length * 2);
        }
        if (index >= 0 && index <= count) {
            addIndex(index, element);
            count++;
        }else{
            throw new RuntimeException("Invalid index");
        }
    }
    @Override
    public String toString() {
        Object [] newArray = new Object[count];
        System.arraycopy(array, 0, newArray, 0, count);
        return Arrays.toString(newArray);
    }
    public void set(int index ,  Object element) {
        if (index >= 0 && index <= count) {
            array[index] = element;

        }

    }
    private void replaceIndex(int index) {
        Object storeNumber;
        Object replace = Integer.MIN_VALUE;
        array[index] = replace;
        for (int count = 0; count < array.length; count++){
            for (int counter = 0; counter < array.length - count - 1 ; counter++){
                    if (counter >= index && replace.equals(array[counter])){
                     storeNumber = array[counter];
                     array[counter] = array[counter + 1];
                     array[counter + 1] = storeNumber;
                     }
                 }
            }
    }

     private void addIndex(int index,Object element) {
       Object [] newArray = new Object[array.length + 1];
       System.arraycopy(array, 0, newArray, 0, index);
       newArray[index] = element;
       System.arraycopy(array, index, newArray, index + 1, array.length - index);
       System.arraycopy(newArray, 0, array, 0, array.length);

    }

    private void resizeArray(int number){
        array = Arrays.copyOf(array, number);

    }

//    static void main() {
//        MyArrayList list = new MyArrayList();
//        for (int count = 0; count < 30; count++) {
//            list.add("ada");
//        }
//        System.out.println(list);
//    }


}


//
//import java.util.Arrays;
//
//public class MyArrayList {
//    private int count = 0;
//    private static String[] array = new String[10];
//
//    public boolean isEmpty() {
//        return count == 0;
//    }
//
//    public String removeIndex(int number) {
//        if (number <= count && number >= 0) {
//            String initialValue = array[number];
//            replaceIndex(number);
//            count--;
//            return initialValue;
//        }
//        return "Invalid index";
//    }
//
//    public boolean removeName(String name) {
//        for (int counter = 0; counter < array.length; counter++) {
//            if (name.equals(array[counter])) {
//                replaceIndex(counter);
//                count--;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int  size() {
//        return count;
//    }
//
//    public int indexOf(String element) {
//        for(int  counter = 0; counter < array.length; counter++){
//            if(element.equals(array[counter])){
//                return counter;
//            }
//        }
//        return -1;
//    }
//
//    public String getItem(int index) {
//
//        if (index >= 0 && index <= count) {
//            return array[index];
//        }
//        return "Invalid index";
//    }
//
//
//    public void add(String element) {
//        array[count++] = element;
//    }
//    public void add(int index, String element) {
//        if (index >= 0 && index <= count) {
//            addIndex(index, element);
//            count++;
//
//        }else{
//            throw new RuntimeException("Invalid index");
//        }
//    }
//    @Override
//    public String toString() {
//        String [] newArray = new String[count];
//        System.arraycopy(array, 0, newArray, 0, count);
//        return Arrays.toString(newArray);
//    }
//
//    private static void replaceIndex(int index) {
//        String storeNumber;
//        String replace = Integer.MIN_VALUE +"";
//        array[index] = replace;
//        for (int count = 0; count < array.length; count++){
//            for (int counter = 0; counter < array.length - count - 1 ; counter++){
//                if (counter >= index && replace.equals(array[counter])){
//                    storeNumber = array[counter];
//                    array[counter] = array[counter + 1];
//                    array[counter + 1] = storeNumber;
//                }
//            }
//        }
//    }
//
//    private void addIndex(int index,String element) {
//        String [] newArray = new String[array.length + 1];
//        System.arraycopy(array, 0, newArray, 0, index);
//        newArray[index] = element;
//        System.arraycopy(array, index, newArray, index + 1, array.length - index);
//        System.arraycopy(newArray, 0, array, 0, array.length);
//
//    }
//
//
//}
//
//

















//private void addIndex(int index,String element) {
//    int [] num = {2,3,33,44,7,88,12};
//    int [] newArray = new int[num.length + 1];
//    int change = 2;
//    System.arraycopy(num, 0, newArray, 0, change);
//    newArray[change] = 42;
//
//    System.arraycopy(num, change, newArray, change + 1, num.length - change);
//    System.out.println(Arrays.toString(newArray));
//}



//for (int i = change; i < num.length; i++) {
//newArray[i + 1] = num[i];
//        }

//
//static void replaceIndex() {
//    int[] num = {-1,0,-1,7,0,0,0,9,0,0};
//    int storeNumber = 0;
//    int replace = Integer.MIN_VALUE;
//    num[2] = replace;
//    for (int i = 0; i < num.length; i++){
//        for (int j = 0; j < num.length - i - 1 ; j++){
//            if (j >= 2 && num[j] == replace){
//                storeNumber = num[j];
//                num[j] = num[j + 1];
//                num[j + 1] = storeNumber;
//            }
//        }
//    }
//    System.out.println(Arrays.toString(num));