import java.util.*;

/**
 * Write a description of class QuickSort_first here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSortFirst<T extends Comparable<? super T>>extends QuickSorter<T> {
    
    /**
     * Constructor for objects of class QuickSort1
     */
    public QuickSortFirst() {}

    public T[] sorting (T [] y){
        sort(y);
        return y;
    }
    
    private void qSort (T[] a, int fst, int lst) {
        
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst);
        }
    }

    public void swap(T[] a, int x, int y) { 
        T tmp = a[x]; 
        a[x] = a[y]; 
        a[y] = tmp;
    } 

    private int partition (T[] a, int fst, int lst) {
        T pivot = a[fst];
        
        int u = fst;
        int d = lst;
        
        do {
            while ((u < lst) && (pivot.compareTo(a[u]) >= 0)) {
                u++; 
            }
        
            while (pivot.compareTo(a[d]) < 0) {
                d--;
            }
        
            if (u < d) {
                swap(a, u, d);
            }
        
        } while (u < d);
        
        swap(a, fst, d);
        
        return d;
    }
}
