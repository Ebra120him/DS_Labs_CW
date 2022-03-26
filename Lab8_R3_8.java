package Lab8_HW;

import Lab_7.DoublyLinkedList;

/**
 * Created by SCC on 3/26/2022.
 *///I use this method and the DoublyLinkedList class.
/* public void find()
    {
        Node<E> temp=null;
        int counter=0;int s=0;
        temp=header;
        while (temp.next!=null)
        {
            temp=temp.getNext();
            counter++;
        }
        System.out.println("The number of Nodes = "+(counter-1));
        if (((counter-1)%2)==0)
        {
            s=counter/2;
            System.out.println("The number of middle node = "+s);
        }
        else
        {
            s=counter/2;
            System.out.println("The number of middle node = "+s);
        }
        Node<E> middle=null;
        middle=header;
        for (int i = 0; i <s ; i++) {
            middle=middle.getNext();
        }
        System.out.println("The value of middle node = "+middle.getElement());}*/
public class Lab8_R3_8 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFrist(1);list.addFrist(2);list.addFrist(3);list.addFrist(4);list.addFrist(5);list.addLast(6);list.addFrist(7);
        System.out.println();
        list.find();}}