package Lab7_HW;

/**
 * Created by SCC on 3/25/2022.
 */
class Lab7_R3_15
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    boolean areIdentical(Lab7_R3_15 listb)
    {
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.data != b.data)
                return false;

            a = a.next;
            b = b.next;
        }

        return (a == null && b == null);
    }

    void push(int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head;

        head = new_node;
    }

    public static void main(String args[])
    {
        Lab7_R3_15 llist1 = new Lab7_R3_15();
        Lab7_R3_15 llist2 = new Lab7_R3_15();

        llist1.push(1);
        llist1.push(2);
        llist1.push(3);

        llist2.push(1);
        llist2.push(2);
        llist2.push(3);

        if (llist1.areIdentical(llist2) == true)
            System.out.println("Identical ");
        else
            System.out.println("Not identical ");
    }
}
