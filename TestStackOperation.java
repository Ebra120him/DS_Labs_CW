import java.util.Scanner;

/**
 * Created by LAB on 1/26/2022.
 */
public class TestStackOperation {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack= new ArrayStack<>(5);
        Scanner in= new Scanner(System.in);
        System.out.println("is the stack empty?"+myStack.isEmpty());
        System.out.println("input stack elements");
        for (int i = 0; i <5 ; i++) {
           myStack.push(in.nextInt());
            System.out.println("top= "+myStack.top());
            System.out.println("size= "+myStack.size());
            System.out.println("is the stack empty?"+myStack.isEmpty());

        }
        while(!myStack.isEmpty()) {
            System.out.println("deleted =" + myStack.pop());
            ;
            System.out.println("after delete top= " + myStack.top());
            System.out.println("size= " + myStack.size());
            System.out.println("is the stack empty?" + myStack.isEmpty());
        }
        }

    }

