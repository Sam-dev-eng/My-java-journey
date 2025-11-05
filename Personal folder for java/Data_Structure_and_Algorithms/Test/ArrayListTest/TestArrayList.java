package ArrayListTest;

import ArrayList.MyArrayList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestArrayList {
    @Test
    public void testIfMyArrayListIsEmpty() {
        MyArrayList list = new MyArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIfICanAddSomethingInsideMyList() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIfICanAdd_A_DifferentElementInsideMyList() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("Obi");
        assertFalse(list.isEmpty());

    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementWithThereName() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.remove("ada");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementWithThereIndex() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.remove(1);
        assertTrue(list.isEmpty());

    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementAndSeeTheElementIRemoved() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");

        Object result = list.remove(1);
        assertEquals("obi", result);

    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementAndByNameAndReturnsTrueOrFalse() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        boolean result = list.remove("obi");
        assertTrue(result);
    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementAndByNameAndReturnsFalse() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        boolean result = list.remove("Ebi");
        assertFalse(result);
    }

    @Test
    public void testIfICanPrintTheElementINsideMyList() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        assertEquals("[ada, obi, chief]", list.toString());
    }

    @Test
    public void testIfICanRemoveAnElementAndPrintTheRemainingElement() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        Object result = list.remove(1);
        assertEquals("[ada, chief]", list.toString());
        assertEquals("obi", result);
    }

    @Test
    public void testIfICanRemoveTheLastElementAndPrintTheRemainingElement() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        Object result = list.remove(2);
        assertEquals("[ada, obi]", list.toString());
        assertEquals("chief", result);

    }

    @Test
    public void testIfICanCheckTheLengthOfMyArrayList() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        int result = list.size();
        assertEquals(3, result);
    }

    @Test
    public void testIfICanRemoveElementsByTheirNames() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add("orange");
        boolean removed = list.remove("chief");
        assertEquals("[ada, obi, mango, orange]", list.toString());
        assertTrue(removed);
    }

    @Test
    public void testIfICanFindTheIndexOfTheElement() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add("orange");
        int index = list.indexOf("mango");
        assertEquals(3, index);
    }

    @Test
    public void testIfICanFindTheIndexOfTheElementWithTheSameName() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("mango");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add("orange");
        int index = list.indexOf("mango");
        assertEquals(1, index);

    }

    @Test
    public void testIfICanGetTheCopyOfAnAnElementBytheirIndex() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        Object element = list.get(0);
        assertEquals("ada", element);
    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexIWantToAddThem() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add("orange");
        list.add(4,"emma");
        assertEquals(4, list.indexOf("emma"));


    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexIwantToAddThemAndPrintThemOut() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add(2,"emma");
        assertEquals("[ada, obi, emma, chief, mango]",list.toString());

    }

    @Test
    public void testIfICanInsertAnElementWithAnotherIndexIwantToAddThemAndPrintThemOut() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add(3,"emma");
        assertEquals("[ada, obi, chief, emma, mango]",list.toString());

    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexMoreThanTheLength() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");
        list.add(4,"emma");
        assertEquals("[ada, obi, chief, mango, emma]",list.toString());

    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexFarMoreThanTheLength() {
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add("obi");
        list.add("chief");
        list.add("mango");

        assertThrows(RuntimeException.class,()-> list.add(5,"emma"));

    }

    @Test
    public void testIfICanAddNumbersAndStringsInMyArrayList(){
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add(1);
        list.add(2);
        list.add("obi");
        list.add(true);
        assertEquals("[ada, 1, 2, obi, true]",list.toString());

    }

    @Test
    public void testIfICanRemoveNumbersAndStringsInMyArrayList(){
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add(1);
        list.add(2);
        list.add("obi");
        list.add(true);
        list.remove(4);
        assertEquals("[ada, 1, 2, obi]",list.toString());

    }
    @Test
    public void testIfICanRemoveElementsFromDifferentAnglesInMyArrayList(){
        MyArrayList list = new MyArrayList();
        list.add("ada");
        list.add(1);
        list.add(2);
        list.add("obi");
        list.add(true);
        list.remove(3);
        assertEquals("[ada, 1, 2, true]",list.toString());

    }


    @Test
    public void testIfICanAddMultipleNumbersAndStringsInMyArrayList(){
        MyArrayList list = new MyArrayList();
        for (int count = 0; count < 20; count++) {
            list.add("ada");
        }
        assertEquals("[ada, ada, ada, ada, ada, ada, ada, ada, ada, ada," +
                " ada, ada, ada, ada, ada, ada, ada, ada, ada, ada]",list.toString());


    }

    @Test
    public void testIfICanRemoveMultipleNumbersAndStringsInMyArrayList(){
        MyArrayList list = new MyArrayList();
        for (int count = 0; count < 20; count++) {
            list.add("ada");

        }
        for (int count = list.size() -1 ; count >= 0; count--) {
            list.remove(count);
        }
        assertTrue(list.isEmpty());
    }

    @Test
    public void testMySetFunction(){
        MyArrayList list = new MyArrayList();
        for (int count = 0; count < 10; count++) {
            list.add("ada");
        }
        list.set(0, true);
        assertEquals(true, list.get(0));
    }




}
