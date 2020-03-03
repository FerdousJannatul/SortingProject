
/**
 * Abstract class QuickSorter - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class QuickSorter<T extends Comparable<? super T>> implements Sorter<T>
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sort (T[] a) {
        qSort(a, 0, a.length-1);
    }

    private void qSort (T[] a, int fst, int lst) {
        
    }
}
