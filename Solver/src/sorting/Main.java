package sorting;

public class Main {

    public static void main(String[] args) {
	// declare variable
        final int SIZE = 100;
        int[] array = new int[SIZE];

        Sort s = new Sort();
        s.initializeArray(array,SIZE);
        System.out.print("Initially, the array is: ");
        s.displayArray(array,SIZE);

        System.out.println();
        System.out.print("After randomization, the array becomes: ");

        s.randomizeArray(array,SIZE);
        s.displayArray(array,SIZE);

        System.out.println();
        System.out.print("The array is now sorted: ");

        //All the below sorting will be tested

       s.insertionSort(array, SIZE);
       s.selectionSort(array, SIZE);
       s.quick(array,0,SIZE-1);
       s.quickSort(array, SIZE);

        s.displayArray(array, SIZE);

    }
}
