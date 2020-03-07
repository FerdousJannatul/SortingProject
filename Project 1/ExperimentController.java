import java.util.*;

/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController {
    long startTime;
    long stopTime;

    public static Integer[] tester;
    public static int[] current;
    public static ExperimentController ec = new ExperimentController();

    public static void main(String[] args) {
        int[] smallNumberOfElements = {100, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000};
        int[] mediumNumberOfElements = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
        int[] largeNumberOfElements = {100000, 500000, 1000000, 5000000, 10000000, 50000000, 100000000, 500000000, 1000000000};

        /* I am using this 'current' variable so that I only change what 
         * array I'm using (out of small, medium, large elements ^^^)
         * so that I don't have to change it in multiple places
        */
        
        current = smallNumberOfElements;      
        
        /*
         * You will have to change line 59, 74, 95, 113 to change the
         * sorting method being used. Currently bubble sort is being tested.
         * I could not figure out a better way of changing the sorting
         * method in an easier way, so if you figure out that out please fix it
         */ 

        System.out.println("Random Unsorted Array Test:");
        randomArrayTest();

        System.out.println();

        System.out.println("Partially Sorted Array Test:");
        partiallySortedArrayTest();

        System.out.println();

        System.out.println("Sorted Array Test:");
        sortedArrayTest();

        System.out.println();

        System.out.println("Reverse Order Sorted Array Test:");
        reverseSortedArrayTest();
    }

    public static void randomArrayTest() { //Test for random values
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < current.length; i++) {
            tester = new Integer[current[i]];

            for (int j = 0; j < tester.length; j++) {
                tester[j] = random.nextInt(current[i]);
            }

            System.out.println("Number of elements: " + current[i] + ". Time taken: " + ec.timeBubbleSort());
        }
    }

    //Test for sorted array
    public static void sortedArrayTest() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < current.length; i++) {
            tester = new Integer[current[i]];

            for (int j = 0; j < tester.length; j++) {
                tester[j] = j;
            }

            System.out.println("Number of elements: " + current[i] + ". Time taken: " + ec.timeBubbleSort());
        }
    }

    public static void partiallySortedArrayTest() {
        //int numOfitems = 20;

        //int[] arr = new int[numOfitems];
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < current.length; i++) {
            tester = new Integer[current[i]];

            for (int j = 0; j < tester.length; j = j + 2){
                int max = i*10;
                int min = max-10;

                tester[j] = rand.nextInt((max - min) + 1) + min;
                tester[j+1] = rand.nextInt((max - min) + 1) + min;
            }

            System.out.println("Number of elements: " + current[i] + ". Time taken: " + ec.timeBubbleSort());
        }

        // for (int i = 0; i < numOfitems; i = i + 1){
        // System.out.println(arr[i]);
        // }
    }
    
    public static void reverseSortedArrayTest() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < current.length; i++) {
            tester = new Integer[current[i]];

            for (int j = 0; j < tester.length; j++) {
                tester[j] = tester.length - 1 - j;
            }

            System.out.println("Number of elements: " + current[i] + ". Time taken: " + ec.timeBubbleSort());
        }
    }

    public long timeBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();

        startTime = System.currentTimeMillis();

        bubbleSort.sorting(tester);
        //System.out.println("Bubble Sort: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();

        startTime = System.currentTimeMillis();

        selectionSort.sorting(tester);
        //System.out.println("Selection Sort: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();

        startTime = System.currentTimeMillis();

        insertionSort.sorting(tester);
        //System.out.println("Insertion Sort: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeMergeSort() {
        MergeSort mergeSort = new MergeSort();

        startTime = System.currentTimeMillis();

        mergeSort.sorting(tester);
        //System.out.println("Merge Sort: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeQuickSortFirst() {
        QuickSortFirst quickSortFirst = new QuickSortFirst();

        startTime = System.currentTimeMillis();

        quickSortFirst.sorting(tester);
        //System.out.println("QS First: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeQuickSortMedian() {
        QuickSortMedian quickSortMedian = new QuickSortMedian();

        startTime = System.currentTimeMillis();

        quickSortMedian.sorting(tester);
        //System.out.println("QS Median: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    public long timeQuickSortRandom() {
        QuickSortRandom quickSortRandom = new QuickSortRandom();

        startTime = System.currentTimeMillis();

        quickSortRandom.sorting(tester);
        //System.out.println("QS Random: " + Arrays.toString(tester));

        stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }
}