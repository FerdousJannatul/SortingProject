
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSort<T extends Comparable<? super T>> implements Sorter<T>
{

    /**
     * Constructor for objects of class InsertionSort
     */
    public InsertionSort()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public T [] sorting (T [] y){
        //int nextPos=0;
       for (int nextPos = 1;nextPos < y.length; nextPos++) {
        insert(y, nextPos);
      } 
      return y;
    }
    
    private void insert (T [] y, int nextPos) {
        T nextVal = y[nextPos];
        while (nextPos > 0 && nextVal.compareTo(y[nextPos-1]) < 0){
            y[nextPos] = y[nextPos-1];
            nextPos--;
        }
        y[nextPos] = nextVal;
    }
}
