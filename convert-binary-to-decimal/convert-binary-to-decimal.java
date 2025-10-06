/*
  public class LinkedList {
      private Node head;
      private int length;
      class Node {
          int value;
          Node next;
          Node(int value) {
              this.value = value;
          }
      }
      public LinkedList(int value) {
          Node newNode = new Node(value);
          head = newNode;
      }
  }
*/

public class Solution{
    public int binaryToDecimal(){
        int num = 0;
        Node current = head;
        while(current != null){
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }
}
