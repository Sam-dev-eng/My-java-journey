package TestMyHashMap;

import MyHashMap.MyHashMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestMyHashMap {


    @Test
    public void testIfMyHashMapIsEmpty(){
        MyHashMap map = new MyHashMap();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testIfMyHashMapIsNotEmptyWhenIAddAKeyAndAValue(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        assertFalse(map.isEmpty());
    }

    @Test
    public void testICanAddAKeyAndAValueAndRemoveByKey(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.remove(1);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testICanAddAKeyAndAValueAndRemoveKeyThatDoesNotExist(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.remove(4);
        assertFalse(map.isEmpty());

    }

    @Test
    public void testIfICanAddAKeyAndReplaceAValueOfAKeyNotTheKey(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put("two",2);
        map.put(3,"Three");
        assertTrue(map.replace("two",2,"two"));

    }

    @Test
    public void testMyGetFunction(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        assertEquals("One", map.get(1));
    }

    @Test
    public void testIfMyFunctionWillReturnNullWhenKeyDoesNotExist(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        assertNull(map.get(4));
    }

    @Test
    public void testIfICanGetTheLengthOfMyHashMap(){
        MyHashMap map = new MyHashMap();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        assertEquals(4, map.size());
        System.out.println(map);
    }




}
