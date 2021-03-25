import java.util.Iterator;

public class DList implements Iterable<String>{
    private Node nil;

    public DList(){
        nil = new Node();
        nil.previous = nil;
        nil.next = nil;
        nil.data = null;
    }
    public void addFirst(String elem){
        Node newNode = new Node(elem);
        newNode.next = nil.next;
        nil.next.previous = newNode;
        newNode.previous = nil;
        nil.next = newNode;
    }
    public void addLast(String elem){
        Node newNode = new Node(elem);
        newNode.next = nil.previous;
        nil.previous.previous = newNode;

    }
    public String getFirst(){
        return nil.next.data;
    }
    public String getLast(){
        return nil.previous.data;
    }
    public String removeFirst(){return null;}
    public String removeLast(){return null;}
    public String get(int index){return null;}
    public String set(int index, String value){return null;}
    public boolean contains(Object obj){return true;}
    public int size(){return 0;}
    public int indexOf(Object obj){return 0;}


    private class DListIterator implements Iterator<String> {
        private Node pointer;

        public DListIterator(){
            if(nil.next== nil)
                pointer= nil;
            else
                pointer= nil.next;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
