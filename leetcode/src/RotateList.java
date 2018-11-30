import java.util.*;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int len = 0;
        ListNode node = head;
        ListNode last = null;
        ListNode newhead  = null;
        while(node != null){
            len++;
            last = node;
            node = node.next;
        }
        node = head;
        int count = 0;
        k = k % len;
        if(k == 0){
            return head;
        }
        while(count < len - k){
            count++;
            node = node.next;
        }
        newhead = node.next;
        node.next = null;
        last.next = head;
        return  newhead;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = rotateRight(head, 3);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}