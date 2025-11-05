package MySet;
import ArrayList.MyArrayList;

public class MySet  {
    public int length;
    MyArrayList list = new MyArrayList();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void setlength() {
         length = list.size();
    }

    public Object remove(int number) {
        return list.remove(number);
    }

    public boolean remove(Object name) {
        return list.remove(name);
    }
    public  int  size() {
        return list.size();
    }

    public int indexOf(Object element) {
        return list.indexOf(element);
    }
    public Object get(int index) {

        return list.get(index);
    }

    public boolean add(Object element) {

        for (int count = 0; count < list.size(); count++) {
            if (element.equals(list.get(count))) {
                return false;
            }
        }
        return list.add(element);
    }

    public void add(int index, Object element) {
        for (int count = 0; count < list.size(); count++) {
            if (element.equals(list.get(count))) {
                return;
            }
        }
        list.add(index,element);
    }

    public String toString() {
        return list.toString();
    }




}
