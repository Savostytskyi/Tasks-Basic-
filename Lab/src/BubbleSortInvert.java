
public class BubbleSortInvert {

	    public static int[] sort(int[] arr) {
	        for (int limit = 0; limit < arr.length; limit++) {
	            for (int index = arr.length-1; index > limit; index--) {                
	                if (arr[index] < arr[index - 1]) {
	                    int tmp = arr[index];
	                    arr[index] = arr[index - 1];
	                    arr[index - 1] = tmp;
	                }
	            }
	        }
	        return arr;
	    }
	}

