package sorting;
import java.util.Random;
public class Sort {

    //swap the ith element with jth elements.
    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //initialize the array a with elements from 0 to size-1.
    public void initializeArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            a[i] = i;
        }
    }

    //display the elements in the array a, 10 elements per row
    public void displayArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //randomly swap two elements in array a for SWAPTIMES times.
    public void randomizeArray(int[] a, int size) {
        final int SWAPTIMES = 10000;
        Random r = new Random();
        int j, k;
        for (int i = 0; i < SWAPTIMES; i++) {
            j = r.nextInt(size);
            k = r.nextInt(size);
            this.swap(a, j, k);
        }
    }

    //insertionSort is correct
    public void insertionSort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            int next = a[i];
            //Move all larger elements up
            int j = i;
            while (j > 0 && a[j - 1] > next) {
                a[j] = a[j - 1];
                j--;
            }
            //Insert the element
            a[j] = next;
        }

    }

    //SelectionSort
    public void selectionSort(int[] a, int size) {
        for (int i = 0; i < size-1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
    }

    //HelperMethods perform a particular repetitive task common across multiple classes
        public static int partition(int[]a,int start, int end) {
            int pivot = a[end]; // pivot element
            int i = (start - 1);
            for (int j = start; j <= end-1; j++) {
                //if current element is smaller than the pivot
                if (a[j] < pivot) {
                    i++; //increment index of smaller element
                     int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            int t = a[i+1];
            a[i+1] = a[end];
            a[end] = t;
            return (i+1);
        }

        //function to implement quick sort
        public static void quick ( int[] a, int start, int end) {
            if (start < end)
            {
                int p = partition(a, start, end);//p is the partitioning index
                quick(a, start,p - 1);
                quick(a,p + 1, end);
            }

        }

        //Print the array by quickSort
        public void quickSort(int[]a, int size)
        {
        for(int i = 0; i<size; i++){
            System.out.print(a[i]+"");
        }
    }

   }

