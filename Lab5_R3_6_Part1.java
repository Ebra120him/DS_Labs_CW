package Lab_5_HW;


/**
 * Created by SCC on 3/25/2022.
 */
public class Lab5_R3_6_Part1 {
    Lab5_R3_6_Part2 start;
    Lab5_R3_6_Part1()
    {
        start = null;
    }

    public void add(int data)
    {
        if(this.start == null)
        {
            Lab5_R3_6_Part2 temp = new Lab5_R3_6_Part2(data);
            this.start = temp;
        }
        else
        {
            Lab5_R3_6_Part2 temp = new Lab5_R3_6_Part2(data);
            temp.next = this.start;
            this.start = temp;
        }
    }

    public int findSecondLastNode(Lab5_R3_6_Part2 ptr)
    {
        Lab5_R3_6_Part2 temp = ptr;

        
        if(temp == null || temp.next == null)
            return -1;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args)
    {
        Lab5_R3_6_Part1 list = new Lab5_R3_6_Part1();

        list.add(23);
        list.add(7);
        list.add(8);
        list.add(12);

        System.out.println(list.findSecondLastNode(list.start));

    }
}
