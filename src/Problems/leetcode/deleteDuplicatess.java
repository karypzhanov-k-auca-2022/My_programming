package Problems.leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class deleteDuplicatess {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int valToSkip = curr.val;

                while (curr != null && curr.val == valToSkip) {
                    curr = curr.next;
                }

                prev.next = curr;
            } else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
                prev.next = null;
            }
        }

        return dummy.next;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null)
            return null;
        // If the current node is a duplicate, skip all nodes with the same value
        if (head.next != null && head.val == head.next.val) {
            int dup = head.val;
            while (head != null && head.val == dup) {
                head = head.next;
            }
            return deleteDuplicates2(head);
        }

        // Otherwise, keep the current node and move to the next node
        head.next = deleteDuplicates2(head.next);
        return head;
    }
}