
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort() {}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public T [] sorting (T [] y) {
        int n = y.length;

        for (int fill = 0; fill < n-1; fill++) {
            
            int posMin = fill;
            
            for (int nxt = fill+1; nxt < n; nxt++) {
                
                if (y[nxt].compareTo(y[posMin])<0) {
                    posMin = nxt;
                }
                
                T tmp = y[fill];
                y[fill] = y[posMin];
                y[posMin] = tmp;
            } 
        }

        return y;
    }
}
