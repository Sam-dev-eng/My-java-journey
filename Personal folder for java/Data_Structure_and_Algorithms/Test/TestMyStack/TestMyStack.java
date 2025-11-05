package TestMyStack;

import MyStack.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class TestMyStack{
        @Test
        public void testStackStructure_isEmpty() {
            MyStack makaStack = new MyStack();
            assertTrue(makaStack.isEmpty());
        }

        @Test
        public void  addOneElementToStackAndItsNotEmpty() {
            MyStack makaStack = new MyStack();
            makaStack.pushElement(5);
            assertFalse(makaStack.isEmpty());
        }

        @Test
        public void addOneElementToStackAndRemoveIt(){
            MyStack makaStack = new MyStack();
            makaStack.pushElement(5);
            makaStack.popElement();
            assertTrue(makaStack.isEmpty());
        }

        @Test
        public void addTwoElementsToStackAnd(){
            MyStack makaStack = new MyStack();
            makaStack.pushElement(5);
            makaStack.pushElement(10);
            assertFalse(makaStack.isEmpty());
        }

        @Test
        public void removeTwoElementsFromStackAndis_Empty(){
            MyStack makaStack = new MyStack();
            makaStack.pushElement(5);
            makaStack.pushElement(10);
            assertFalse(makaStack.isEmpty());
            makaStack.popElement();
            makaStack.popElement();
            assertTrue(makaStack.isEmpty());
        }

        @Test
        public void addTwoElementsRemoveOneAndIsEmptyIsFalse(){
            MyStack makaStack = new MyStack();
            makaStack.pushElement(5);
            makaStack.pushElement(10);
            assertFalse(makaStack.isEmpty());
            makaStack.popElement();
            assertFalse(makaStack.isEmpty());
        }

    }

