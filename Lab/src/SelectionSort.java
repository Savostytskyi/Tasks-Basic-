import java.util.Arrays;

public class SelectionSort {

			public static int[] selectSort() {
				
				int[] arr = {1,5,3,2,8,99,54,3,0,8,3};
				System.out.println("Исходный массив: "+Arrays.toString(arr));
				int barrier, index, minIndex, tmp;
				for (barrier = 0; barrier < arr.length - 1; barrier++) {
					minIndex = barrier;
					
					for (index = barrier + 1; index < arr.length; index++) 
						if (arr[index] < arr[minIndex]) 
							minIndex = index;
							if (minIndex != barrier) {
								tmp = arr[barrier];
								arr[barrier] = arr[minIndex];
								arr[minIndex] = tmp;
							}
							
				}
				return arr;
			}
		}


