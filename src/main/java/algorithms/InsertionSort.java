package algorithms;

// sorts an array by Insertion Sort
public class InsertionSort {

    // fills and runs array
    public static void main(String[] args) {
        // populates numbers into objects
        Integer[] vals = new Integer[]{2,4,7,3,6,1,4,9,10};

        // fills array with values (objects)
        Integer[] array = InsertionSort.insertionSort(vals);

        // prints out array to view
        for (Number n : array) {
            System.out.print(n+ " | ");
        }
    }

    // generic method to insertion sort (entends Numbers, any and all numbers)
    public static <N extends Number> N[] insertionSort(N[] array) {
        // start timer
        long startTime = System.nanoTime();

        // sees if already sorted.
        if (array.length < 2) {
            return array;
        }

        // iterate throguh the array to sort
        for (int i = 1; i < array.length; i++) {

            // holds value at Array [i] - index 1
            N num = array[i]; // index 1

            // creates index that is 1 less than i
            int j = i - 1; // index 0

            // compare against every value in sorted side of the list until spot is found.
            while (j >= 0 && array[j].doubleValue() > num.doubleValue()) { //doubleValue used when generic Number is used.
                // shuffles elements to the right
                array[j + 1] = array[j];
                // moves J
                j--;
            }
            // insert num at determined location
            array[j + 1] = num;
        }
        // prints out timer / stop timer
        System.out.println("Insertion Sort Time in nano seconds : " + (System.nanoTime() - startTime));
        // returns results
        return array;
    }
}
