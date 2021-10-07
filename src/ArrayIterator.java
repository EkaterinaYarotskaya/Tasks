import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator <Z> implements Iterator<Z> {
    public ArrayIterator(int index) {
        this.index = index;
    }

    private int index=0;
    private Z[] arr;
    @Override
    public boolean hasNext() {
        return index< arr.length;
    }

    @Override
    public Z next() {
        if (!hasNext()){
            throw new  NoSuchElementException();
        }
        return arr[index++];
    }
}
