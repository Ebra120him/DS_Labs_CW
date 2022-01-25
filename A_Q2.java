package Lab1;

/**
 * Created by SCC on 1/25/2022.
 */
public class A_Q2 {
    static int intArray[] ={1,2,3,4};

    public  void CopyArray ()
    {
        // Create an array copyArray[] of same size as intArray[]
        int copyArray[] = new int[intArray.length];

        // intArray is assigned to copyArray; so references point to same location
        copyArray = intArray;

        // change element of copyArray
         copyArray[3]++;

        //print both arrays
        System.out.println("\nContents of intArray[]:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");
        System.out.println("\nContents of copyArray[]:");
        for (int i=0; i<copyArray.length; i++)
            System.out.print(copyArray[i] + " ");
    }
    public static void main(String[] args)
    {
        //print original intArray
        System.out.println("Contents of intArray[] before assignment:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");


        A_Q2 nam = new A_Q2();
        nam.CopyArray();
    }
}
