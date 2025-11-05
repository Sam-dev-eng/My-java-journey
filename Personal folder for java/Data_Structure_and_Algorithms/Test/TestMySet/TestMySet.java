package TestMySet;

import MySet.MySet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {


    @Test
    public void testThatMySetIsEmpty() {
        MySet mySet = new MySet();
        assertTrue(mySet.isEmpty());


    }
    @Test
    public void testToAddInMySetAndCheckIfItsEmpty() {
        MySet mySet = new MySet();
        mySet.add("ada");
        assertFalse(mySet.isEmpty());

    }
    @Test
    public void testIfICanAdd_A_DifferentElementInsideMyList() {
        MySet list = new MySet();
        list.add("ada");
        list.add("Obi");
        assertFalse(list.isEmpty());

    }
    @Test
    public void testIfICanAddAndRemoveAnotherElementWithThereName() {
        MySet list = new MySet();
        list.add("ada");
        list.remove("ada");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIfICanAddDuplicates() {
        MySet set = new MySet();
        set.add("ada");
        set.add("ada");
        set.add("ada");
        set.add("obi");
        System.out.println(set);
        assertEquals("[ada, obi]", set.toString());
    }
    @Test
    public void testIfICanAddAndRemoveAnotherElementWithThereIndex() {
        MySet set = new MySet();
        set.add("ada");
        set.remove(1);
        assertTrue(set.isEmpty());

    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementAndSeeTheElementIRemoved() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");

        Object result = set.remove(1);
        assertEquals("obi", result);

    }

    @Test
    public void testIfICanAddAndRemoveAnotherElementAndByNameAndReturnsTrueOrFalse() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        boolean result = set.remove("obi");
        assertTrue(result);
    }

    @Test
    public void testIfICanPrintTheElementINsideMyList() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("obi");
        assertEquals("[ada, obi, chief]", set.toString());
    }

    @Test
    public void testIfICanRemoveAnElementAndPrintTheRemainingElement() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        Object result = set.remove(1);
        assertEquals("[ada, chief]", set.toString());
        assertEquals("obi", result);
    }

    @Test
    public void testIfICanRemoveTheLastElementAndPrintTheRemainingElement() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        Object result = set.remove(2);
        assertEquals("[ada, obi]", set.toString());
        assertEquals("chief", result);

    }
    @Test
    public void testIfICanCheckTheLengthOfMyArrayList() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        int result = set.size();
        assertEquals(3, result);
    }

    @Test
    public void testIfICanRemoveElementsByTheirNames() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        set.add("orange");
        boolean removed = set.remove("chief");
        assertEquals("[ada, obi, mango, orange]", set.toString());
        assertTrue(removed);
    }

    @Test
    public void testIfICanFindTheIndexOfTheElement() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        set.add("orange");
        int index = set.indexOf("mango");
        assertEquals(3, index);
    }

    @Test
    public void testIfICanFindTheIndexOfTheElementWithTheSameName() {
        MySet set = new MySet();
        set.add("ada");
        set.add("mango");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        set.add("orange");
        int index = set.indexOf("mango");
        assertEquals(1, index);

    }

    @Test
    public void testIfICanGetTheCopyOfAnAnElementBytheirIndex() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        Object element = set.get(0);
        assertEquals("ada", element);
    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexIWantToAddThem() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        set.add("orange");
        set.add(4,"emma");
        assertEquals(4, set.indexOf("emma"));


    }

    @Test
    public void testIfICanInsertAnElementWithAnotherIndexIwantToAddThemAndPrintThemOut() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");
        set.add(3,"emma");
        assertEquals("[ada, obi, chief, emma, mango]",set.toString());

    }

    @Test
    public void testIfICanInsertAnElementWithTheIndexFarMoreThanTheLength() {
        MySet set = new MySet();
        set.add("ada");
        set.add("obi");
        set.add("chief");
        set.add("mango");

        assertThrows(RuntimeException.class,()-> set.add(5,"emma"));

    }

    @Test
    public void testIfICanAddNumbersAndStringsInMyArrayList(){
        MySet set = new MySet();
        set.add("ada");
        set.add(1);
        set.add(2);
        set.add("obi");
        set.add(true);
        assertEquals("[ada, 1, 2, obi, true]",set.toString());

    }
    @Test
    public void testIfICanRemoveNumbersAndStringsInMyArrayList(){
        MySet set = new MySet();
        set.add("ada");
        set.add(1);
        set.add(2);
        set.add("obi");
        set.add(true);
        set.remove(4);
        assertEquals("[ada, 1, 2, obi]",set.toString());

    }

    @Test
    public void testIfICanAddMultipleNumbersAndStringsInMyArrayList(){
        MySet set = new MySet();
        for (int count = 0; count < 20; count++) {
            set.add("ada");
        }
        assertEquals("[ada]",set.toString());


    }






}
