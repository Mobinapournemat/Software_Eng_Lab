import java.util.Random;

public class SelectionSort {
    void selectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();

        int[] arr = new int[200000];
        Random rd = new Random();
        rd.setSeed(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
//            System.out.println(arr[i]); // printing each array element
        }
        ob.selectionSort(arr);
    }
}
