import java.util.Arrays;
import java.util.function.Consumer;

public class MyBeautifulList<T extends Comparable<T>>  {
    private Object[] elements;
    private int size;
    private static final int defaultCapacity = 5;
    public MyBeautifulList(){
        elements = new Object[defaultCapacity];
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("There is no element in this index:" + index);
        }
        return (T) elements[index];
    }

    public void add(T element){
        resizeList(size+1);
        elements[size++] = element;
    }

    private void resizeList(int capacity) {
        if(capacity > defaultCapacity){
            int newCapacity = defaultCapacity * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public int getSize(){
        return size;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("There is no element in this index:" + index);
        }
        int move = size - index - 1;
        if(move > 0){
            System.arraycopy(elements, index+1, elements, index, move);
        }
        elements[--size] = null;
    }
    public void findIndex(T elementName){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if(elementName == elements[i]){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("There is no element");
        }

    }

    public T getLastElement(){
        return (T) elements[size-1];
    }

    public T getFirstElement(){
        return (T) elements[0];
    }

    public boolean contains(T elementName){
        for (int i = 0; i < size; i++) {
            if(elementName == elements[i]){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /*
    public void sort(){
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (elements[j].compareTo(elements[minIndex])) {
                    minIndex = j;
                }
            }
            T temp = (T) elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }
    }
     */

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
