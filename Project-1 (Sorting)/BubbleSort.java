
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort<T extends Comparable<? super T>> implements Sorter<T>
{

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public T [] sorting (T [] y)
    {
        for (int i = 0; i< y.length - 1; i++){
            for (int j = 0; j < y.length -1 - i; j++){

                if (y[j+1].compareTo(y[j]) < 0)
                {
                    T tmp = y[j];
                    y[j] = y[j+1];
                    y[j+1] = tmp;
                }
            }
        }
        return y;
    }
}
