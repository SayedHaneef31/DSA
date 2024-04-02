//package LinkedList_15;
//
//public class RemoveFromLast
//{
//
//
//    public static void main(String[] args)
//    {
//        LinkedList LL = new LinkedList();
//        LL.insert(LL,)
//
//    }
//    public static LL removeNthFromEnd(LL head, int n)
//    {
//
//        int len=nodeLength(head);
//        System.out.println(len);
//        if(n>len) return head;
//        len-=n;
//        list pos=head;
//        while(len>1)
//        {
//            pos=pos.next;
//            len--;
//        }
//        if(pos.next.next==null)
//            pos.next=null;
//        return head;
//
//
//    }
//    static int nodeLength(LL head)
//    {
//        int c=0;
//        LL temp=head;
//        while(head!=null)
//        {
//            c++;
//            head=head.next;
//        }
//        return c;
//    }
//}
