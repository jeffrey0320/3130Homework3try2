import java.util.Iterator;
import java.util.NoSuchElementException;

public class DList implements Iterable<String>{
    private Node nil;
    private int numOfElements;

    public DList(){
        nil = new Node();
        nil.previous = nil;
        nil.next = nil;
        nil.data = null;
        numOfElements = 0;
    }
    public void addFirst(String elem){
        Node newNode = new Node(elem);
        newNode.next = nil.next;
        nil.next.previous = newNode;
        newNode.previous = nil;
        nil.next = newNode;
        numOfElements++;
    }
    public void addLast(String elem){
        Node newNode = new Node(elem);
        newNode.previous = nil.previous;
        nil.previous.next = newNode;
        newNode.next = nil;
        nil.previous = newNode;
        numOfElements++;
    }
    public String removeFirst(){
        if(size() == 0)
            throw new NoSuchElementException();

        String oldStr = nil.next.data;
        nil.next.next.previous = nil;
        nil.next = nil.next.next;

        numOfElements--;
        return oldStr;
    }
    public String removeLast(){
        if(size() == 0)
            throw new NoSuchElementException();

        String oldStr = nil.previous.data;
        nil.previous.previous.next = nil;
        nil.previous = nil.previous.previous;

        numOfElements--;
        return oldStr;}
    public String get(int index){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        int count = 0;
        Node temp = nil.next;

        while(count<index){
            count++;
            temp = temp.next;
        }

        return temp.data;
    }
    public String set(int index, String value){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        int count = 0;
        Node temp = nil.next;

        while(count<index){
            count++;
            temp = temp.next;
        }

        Node iter = temp;
        String old = iter.getData();
        iter.setData(value);
        return old;
    }
    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }
    public int size(){return numOfElements;}
    public int indexOf(Object obj){
        int index = 0;
        Node iter = nil.next;

        while(iter!=null){
            if(iter.data.equals(obj))
                return index;
            index++;
            iter=iter.next;
        }
        return -1;
    }
    private class DListIterator implements Iterator<String> {
        private Node pointer;

        public DListIterator(){
            if(nil.next == nil)
                pointer = nil;
            else
                pointer = nil.next;
        }

        @Override
        public boolean hasNext() {
            return pointer!=null;
        }

        @Override
        public String next() {
            String oldStr = pointer.getData();
            pointer = pointer.next;
            return oldStr;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<String> iterator() {
        return new DListIterator();
    }

    public String getFirst(){
        return nil.next.data;
    }
    public String getLast(){
        return nil.previous.data;
    }
}
