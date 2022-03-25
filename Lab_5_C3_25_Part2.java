package Lab_5_HW;

/**
 * Created by SCC on 3/25/2022.
 */
//Lab_5_C3_25_Part2
public class Lab_5_C3_25_Part2 {
    Lab_5_C3_25_Part1 head;

    public void addToTheLast(Lab_5_C3_25_Part1 node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Lab_5_C3_25_Part1 temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList()
    {
        Lab_5_C3_25_Part1 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {

        Lab_5_C3_25_Part2 llist1 = new Lab_5_C3_25_Part2();
        Lab_5_C3_25_Part2 llist2 = new Lab_5_C3_25_Part2();

        llist1.addToTheLast(new Lab_5_C3_25_Part1(1));
        llist1.addToTheLast(new Lab_5_C3_25_Part1(3));
        llist1.addToTheLast(new Lab_5_C3_25_Part1(6));

        llist2.addToTheLast(new Lab_5_C3_25_Part1(2));
        llist2.addToTheLast(new Lab_5_C3_25_Part1(4));
        llist2.addToTheLast(new Lab_5_C3_25_Part1(5));


        llist1.head = new To_Sort().sortedMerge(llist1.head,
                llist2.head);
        System.out.print("After Merged :");
        llist1.printList();


    }
}

class To_Sort
{

    Lab_5_C3_25_Part1 sortedMerge(Lab_5_C3_25_Part1 headA, Lab_5_C3_25_Part1 headB)
    {

        Lab_5_C3_25_Part1 dummyNode = new Lab_5_C3_25_Part1(0);
        
        Lab_5_C3_25_Part1 tail = dummyNode;
        while(true)
        {

            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

            if(headA.data <= headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }
}
