public class ParentLL {

    protected Node head;

    // Node represents each element of a linked list, containing the data and
    // pointer(s) to other node(s).
    protected static class Node {
        String data;
        Node next;
        Node prev; // only for doubly linked lists

        protected Node(String info) {
            data = info;
            next = null;
            prev = null;
        }
    }

    public void add(int i, String j) {

    }

    public void remove(int i) {

    }

    public void printAll() {

    }

    public void clear() {
        head = null;
    }

    // This print will trigger if the data structure does not have
    // this behavior defined.
    public void revPrintAll() {
        System.out.println(this.getClass().getName() + " does not have the ability to access in reverse.");
    }

}
