import java.util.Arrays;

public class InsertionSort {
    public static int[] insSort() {
    	int[] arr = {1,5,3,2,8,99,54,3,0,8,3};
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int newPos = Arrays.binarySearch(arr, 0, k, newElement);
              
            	if (newPos <0) 
            		newPos=-newPos-1;

            	int lng = k - newPos;
            if(lng > 0)  {
                System.arraycopy(arr, newPos,arr , newPos + 1, lng);
            }
            arr[newPos] = newElement;
        }
        return arr;
    }
}

