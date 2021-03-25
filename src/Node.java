public class Node {
    public String data;
    Node next;
    Node previous;

    public Node(){
        this.data = null;
    }

    public Node(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
