package codewithfreddy;

public class selectionSort {
    public static void main(String[] args) {

        // selection sort = search through an array and keep track of the minimum value during
        //               each iteration. At the end of each iteration, we swap variables.

        //                Quadratic time 0(n^2)
        //                small data set = okay
        //                 large data set = Bad

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionSort(array);

        for (int i : array){
            System.out.print(i);
        }
    }

    private static  void selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++){

            int min = i;

            for (int j = i + 1; j < array.length; j++){

                if(array[min] > array[j]){
                    min = j;
                }
                }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            }
    }

}


