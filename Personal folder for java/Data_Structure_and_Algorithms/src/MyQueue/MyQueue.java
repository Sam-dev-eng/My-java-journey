package MyQueue;

import java.util.Arrays;

public class MyQueue {
     int addCount = 0;
     int removeCount = 0;
     int count = 0;
    private final Object[] queue;

    public MyQueue(int queueSize){
        this.queue = new Object[queueSize];
    }
    public boolean add(Object object){
        if (addCount == queue.length) return false;
        if (removeCount > 0 && count == queue.length) shift();
        this.queue[addCount++] = object;
         count++;
         return true;
    }

    public String toString(){
        Object[] temp = new Object[addCount];
        System.arraycopy(queue,removeCount,temp,0, addCount);
        return Arrays.toString(temp);
    }

    public Object remove(){
        Object removed = queue[removeCount];
        queue[removeCount++] = null;
        addCount--;
        return removed;
    }
    private void shift(){
        Object [] newArray = new Object[queue.length];
        System.arraycopy(queue,removeCount,newArray,0,addCount);
        System.arraycopy(newArray,0,queue,0,queue.length);
        removeCount = 0;
    }

    public Object element(){
        return queue[removeCount];
    }
    public Object peek(){
        if (addCount == 0) return null;
        else return queue[removeCount];
    }

    public Object poll(){
        if (addCount == 0) return null;
        Object removed = queue[removeCount];
        queue[removeCount++] = null;
        addCount--;
        return removed;
    }

}
