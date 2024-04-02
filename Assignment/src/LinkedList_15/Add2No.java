package LinkedList_15;

public class Add2No
{
    public static void main(String[] args)
    {


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        // LinkedList list=new LinkedList();
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null && temp2!=null)
        {
            int x=temp1.val+temp2.val+carry;
            if(x/10==0)
            {
                temp1.val=x;
                carry=0;
                // list.add(x);
            }
            else
            {
                temp1.val=x%10;
                // list.add(x%10);
                carry=x/10;

            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println(carry);

        while(temp1!=null)    //temp1 badi hai
        {
            int x=temp1.val+carry;
            // ListNode node=new ListNode();
            if(x/10==0)
            {
                temp1.val=x;
                carry=0;
                // list.add(x);
            }
            else
            {
                temp1.val=x%10;
                // list.add(x%10);
                carry=x/10;

            }




            temp1=temp1.next;

        }
        while(temp2!=null)    //temp2 badi hai
        {
            int x=temp2.val+carry;

            if(x/10==0)
            {
                temp1.val=x;
                carry=0;
                // list.add(x);
            }
            else
            {
                temp1.val=x%10;
                // list.add(x%10);
                carry=x/10;

            }
            temp1=temp1.next;
            temp2=temp2.next;
            // temp1=temp2;

        }
        if(carry!=0)
        {
            temp1 = new ListNode(carry);
        }

        return l1;


    }



}



