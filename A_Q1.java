package Lab1;

/**
 * Created by SCC on 1/25/2022.
 */
public class A_Q1 {
    static int [] intArray = {10,20,30,40,50,60,70,80,90,100};

    static public void ReverseArray ()
    {
        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
    public static void main(String[] args) {

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();
        System.out.println("Calling the method.");
        ReverseArray();
    }
}
