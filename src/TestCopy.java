/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-29
 * Time:20:54
 **/
class Node{
    public Node next;
    public int data;

    public Node(int data) {
        this.next = next;
        this.data = data;
    }
}
public class TestCopy {
    public Node head;
    public static Node copy(Node head){
        Node newHead =  new Node(-1);
        Node tmp = newHead;
        while(head != null){
            tmp.next = head;
            head = head.next;
            tmp = tmp.next;
        }
        return newHead.next;
    }

}
