public class SList {

  private class Node {

    private int value = 0;
    private Node next = null;

    public Node() {;}
    public Node(int value) { this.value = value; }

    public int getValue() { return value; }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
    public void setNext() { next = null; }
  }

  private Node head = null;

  public SList() {;}

  public void add(int value) {
    Node node = new Node(value);
    if (head == null) head = node;
    else {
      Node curr = head;
      while(curr.getNext() != null) {
        curr = curr.getNext();
      }
      curr.setNext(node);
    }
  }

  public int remove() {
    if (head == null) return -1;
    Node retNode = null;
    Node curr = head;
    while(curr.getNext().getNext() != null) {
      curr = curr.getNext();
    }
    retNode = curr.getNext();
    curr.setNext();
    return retNode.getValue();
  }

  public void printValues() {
    Node curr = head;
    while(curr != null) {
      System.out.println(curr.getValue());
      curr = curr.getNext();
    }
  }
}
