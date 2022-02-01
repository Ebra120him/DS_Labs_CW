package Lab_2;
import java.util.Stack;
public class DS_Lab3_R_4 {
    Stack<Object> S = new Stack<>();
    Stack<Object> T = new Stack<>();
    public static void main(String[] args) {

        DS_Lab3_R_4 g = new DS_Lab3_R_4();

        g.S.push("a");
        g.S.push(2);
        g.S.push(3);
        g.S.push(4);
        System.out.println("Stack S="+g.S);
        System.out.println("S.size ="+g.S.size());
         int t =g.S.size();
        for (int i = 0; i <t ; i++) {
            g.T.push(g.S.pop());
        }
        System.out.println("Stack T="+g.T);
    }}
