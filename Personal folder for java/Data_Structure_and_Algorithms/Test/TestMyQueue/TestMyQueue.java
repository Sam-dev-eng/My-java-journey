package TestMyQueue;

import MyQueue.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestMyQueue {

    @Test
    public void testIfICanAddToMyQueue() {
        MyQueue queue = new MyQueue(10);
        queue.add("ada");
        queue.add("obi");
        assertEquals("[ada, obi]", queue.toString());
    }
    @Test
    public void testIfICanAddAndRemoveFromMyQueue(){
    MyQueue queue = new MyQueue(10);
    queue.add("ada");
    queue.add("obi");
    queue.remove();
    assertEquals("[obi]", queue.toString());

    }

    @Test
    public void testIfICanAddMultipleItemsAndRemoveThem(){
        MyQueue queue = new MyQueue(10);
        queue.add("ada");
        queue.add("obi");
        queue.add("emma");
        queue.add("sam");
        queue.remove();
        queue.remove();
        assertEquals("[emma, sam]", queue.toString());

    }

    @Test
    public void testIfICanAddAndRemoveMultipleItemsAndRemoveThem(){
        MyQueue queue = new MyQueue(5);
        queue.add("ada");
        queue.add(1);
        queue.add(2);
        queue.add("obi");
        queue.add("emma");
        queue.remove();
        queue.remove();
        queue.add("tayo");
        queue.add("sam");
        assertEquals("[2, obi, emma, tayo, sam]", queue.toString());
        assertFalse(queue.add("ma"));

    }

    @Test
    public void testIfICanRetrieveTheHeadElementFromMyQueue(){
        MyQueue queue = new MyQueue(5);
        queue.add("ada");
        queue.add(1);
        queue.add(2);
        queue.add("obi");
        queue.add("emma");
        assertEquals("ada", queue.element());
        queue.remove();
        queue.remove();
        queue.add("tayo");
        queue.add("sam");
        assertEquals(2, queue.element());
        queue.remove();
        assertEquals("obi", queue.element());
    }

    @Test
    public void testPeekAndPollFunctionIfItWillReturnNullWhenEmpty(){
        MyQueue queue = new MyQueue(5);
        queue.add("ada");
        queue.add(1);
        queue.add(2);
        queue.add("obi");
        queue.add("emma");
        queue.remove();
        queue.remove();
        queue.remove();
        assertEquals("obi",queue.remove());
        queue.poll();
        assertNull(queue.poll());
        assertNull(queue.peek());

    }


}
