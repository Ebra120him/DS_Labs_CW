package Lab_5_HW;

/**
 * Created by SCC on 3/25/2022.
 */

import java.util.*;

class Lab5_R3_12 {

    static class Node {

        int data;
        Node next;
    };
    static  Node head = null;


    static void rotate( int k)
    {
        if (k == 0)
            return;

        Node current = head;


        while (current.next != null)
            current = current.next;

        current.next = head;
        current = head;

        for (int i = 0; i < k - 1; i++)
            current = current.next;

        head = current.next;
        current.next = null;
    }


    static void push(int new_data)
    {

        Node new_node = new Node();

        new_node.data = new_data;

        new_node.next = head;

        head = new_node;
    }


    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void  main(String[] args)
    {
        for (int i = 60; i > 0; i -= 10)
            push( i);

        System.out.print("Given linked list \n");
        printList(head);
        rotate( 2);

        System.out.print("\nRotated Linked list \n");
        printList(head);
    }
}
