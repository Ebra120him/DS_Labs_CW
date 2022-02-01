package Lab_2;
import java.util.Scanner;
import java.util.Stack;
import java.math.*;
// Java program to evaluate value of a postfix expression
import java.util.Stack;
public class DS_Lab3_P_35
{
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');
                //  If the scanned character is an operator, pop two
                // elements from stack.Then apply the operator
            else
            {
                int Operand1 = stack.pop();
                int Operand2 = stack.pop();
                switch(c)
                {
                    case '+':
                        stack.push(Operand2+Operand1);
                        break;
                    case '-':
                        stack.push(Operand2- Operand1);
                        break;
                    case '/':
                        stack.push(Operand2/Operand1);
                        break;
                    case '*':
                        stack.push(Operand2*Operand1);
                        break;
                    case '^':
                        stack.push( (int) Math.pow(Operand2,Operand1));
                        break;}}}
        return stack.pop();
    }
    // Driver program to test above functions
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression in A \"POSTFIX!\" expression.");
        String exp=input.nextLine();
        System.out.println("A \"POSTFIX!\"expression entered = "+exp +" .");
        System.out.println("Postfix evaluation = "+evaluatePostfix(exp)); }}

