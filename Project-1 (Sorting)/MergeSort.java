import java.util.*;

/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort<T extends Comparable<? super T>> implements Sorter<T>
{
   int start;
   int end;
    /**
     * Constructor for objects of class MergeSort
     */
    public MergeSort()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public T [] sorting (T [] y){
        sort(y,start,end);
        return y;
    }

    public void sort (T[] a, int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        sort(a, start, half);
        sort(a, half+1, end);
        merge(a, start, half, end);
    }

    private void merge(T[] y, int start, int half, int end) {
        T[] b = Arrays.copyOfRange(y, start, half+1);
        int i=0; //indexinb
        int j = half+1; // index in second half of a
        int k = start; // index in merged a
        while (i < b.length && j <= end )
            if (b[i].compareTo(y[j]) <= 0) y[k++] = b[i++];
            else
                y[k++] = y[j++];
        while (i < b.length)
            y[k++] = b[i++];
    }
}
