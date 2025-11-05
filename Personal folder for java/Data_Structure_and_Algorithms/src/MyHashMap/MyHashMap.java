package MyHashMap;

import ArrayList.MyArrayList;
import MySet.MySet;

import java.util.Arrays;

public class MyHashMap {

    MyArrayList value = new MyArrayList();
    MySet key = new MySet();
    
    public boolean isEmpty(){
        return value.isEmpty() && key.isEmpty();
    }
    public void put(Object objectKey,Object objectValue){
        key.add(objectKey);
        value.add(objectValue);
    }
    public void remove(Object objectKey){
        value.remove(key.indexOf(objectKey));
        key.remove(objectKey);
    }
    public Object get(Object objectKey){
        if (key.indexOf(objectKey) == -1) return null;
        return value.get(key.indexOf(objectKey));
    }

    public String toString(){
        Object [] newArray = new Object[key.size()];
        for (int i = 0; i < key.size(); i++){
            newArray[i] = key.get(i) + ":" + value.get(i);
        }
        return Arrays.toString(newArray);
    }
    public int size(){
        return key.size();
    }

   public boolean replace (Object objectKey,Object oldValue,Object newValue){
        if (key.indexOf(objectKey) != -1 && value.indexOf(oldValue) != -1 && key.indexOf(objectKey) == value.indexOf(oldValue)){
            value.set(key.indexOf(objectKey), newValue);
            return true;
        }
        return false;
    }
}
