import java.util.Arrays;
import java.util.Scanner;


public class Labs {

	public static void main(String[] args) {
		
        int n,arr[], arrRand[];
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �������: ");
        n = in.nextInt();
        arr = new int [n];
        arrRand = new int [n];
        for (int i=0;i<arr.length;i++) {
        		arrRand[i] = (int) ( Math.random() * n);        		
				arr[i] = i;}
        System.out.println("�������� ������: "+Arrays.toString(arr));
        
        
    	ArrayInverter a = new ArrayInverter();
		System.out.println("��������������� ������: "+Arrays.toString(a.invert(arr)));
		
		Merger mrg = new Merger();
		System.out.println("������ ������: "+Arrays.toString(mrg.merge(arr, arrRand)));
		
		NewMerger nmrg = new NewMerger();
		System.out.println("������ ������ (��������� �����): "+Arrays.toString(nmrg.mergeNew(arr, arrRand)));
		
		BubbleSort bs = new BubbleSort();
		System.out.println("������������� ������ (bubbleSort): "+Arrays.toString(bs.sort(arrRand)));
		
		BubbleSortInvert bsInv = new BubbleSortInvert();
		System.out.println("������������� ������ (bubbleSort inverted): "+Arrays.toString(bsInv.sort(arrRand)));
		
		SelectionSort selSort = new SelectionSort();
		System.out.println("������������� ������ (selection sort): "+Arrays.toString(selSort.selectSort()));
		
		InsertionSort ins = new InsertionSort();
		System.out.println("������������� ������ (insertion sort): "+Arrays.toString(ins.insSort()));
		
		System.out.println("��������� ������������ ������:");
		MatrixMultiplection mul = new MatrixMultiplection();
		mul.MatrixMul();
    }
		
		
	
	}