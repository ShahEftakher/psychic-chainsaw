package AddTwoNumbers_2;

public class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode();
        ListNode traversingList = resultList;
        int sum=0;
        int carry=0;
        while(l1 != null || l2 != null){
            int x = ((l1 == null) ? 0 : l1.val);
            int y = ((l2 == null) ? 0 : l2.val);
            sum = x + y + carry;
            System.out.println("SUM: "+sum);
            System.out.println("Entry: "+sum%10);
            traversingList.next = new ListNode(sum%10);
            traversingList = traversingList.next;
            carry = sum/10;
            System.out.println("Carry: "+carry);
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            if(l1==null && l2==null){
                if(carry != 0){
                    traversingList.next = new ListNode(carry%10);
                    System.out.println("Entry: "+carry%10);
                    break;
                }
                break;
            }
        }
        // System.out.println(2%10);
        return resultList;
    }
}
