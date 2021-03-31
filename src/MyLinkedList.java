public class MyLinkedList {
    public static void main(String[] args) {
        DList list = new DList();
        list.addFirst("Hello");
        list.addFirst("World");
        list.addFirst("Bye");
        list.addLast("yes");
        list.addFirst("hi");

        //System.out.println("Removed " + list.removeFirst());
        //System.out.println("Removed " + list.removeFirst());
        //System.out.println("Removed " + list.removeLast());
        //System.out.println("Removed " + list.removeLast());
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println(list.size());

        //System.out.println(list.indexOf("Bye"));
        //System.out.println(list.contains("no"));

        System.out.println(list.get(4));
    }
}
