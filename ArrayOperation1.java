import java.util.Arrays;

public class ArrayOperation1 {
    public static void main(String[] args) {
        int[] x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
//        System.out.println("after reverse");
//        System.out.println(Arrays.toString(reverse(x)));
        System.out.println("after shelt right");
        System.out.println(Arrays.toString(sheftRight(x)));
    }
    public static int[] sheftRight(int[]b)
    {
        int t=b[b.length-1];
        for (int i = b.length-1; i >0 ; i--) {
            b[i]=b[i-1];
        }
        b[0]=t;
        return b;
    }
    public static int[] sheftLeft(int[]b)
    {
        int t=b[0];
        for (int i = 0; i <b.length-1 ; i++) {
           b[i]=b[i+1];
        }
        b[b.length-1]=t;
        return b;
    }
    public static int[] reverse(int[] a)
    {
        int n= a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
        return a;
    }
}
