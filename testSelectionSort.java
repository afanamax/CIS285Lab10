
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;



public class testSelectionSort {

public SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	testDuplicates();
		}
	  public testSelectionSort() {
	    }

	    public void testPositive(){
	    	SelectionSort temp1 = new SelectionSort();

	    	int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = 2;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 2;
	        Sortedarr[1] = 7;
	        Sortedarr[2] = 8;
	        Sortedarr[3] = 9;
	        Sortedarr[4] = 10;

	        arr = temp1.basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, temp1.basicSelectionSort(arr));


	    }

	    public void testNegative(){

	    	SelectionSort temp1 = new SelectionSort();

	    	int[] arr = new int[5];
	        arr[0] = -8;
	        arr[1] = -9;
	        arr[2] = -7;
	        arr[3] = -10;
	        arr[4] = -2;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = -10;
	        Sortedarr[1] = -9;
	        Sortedarr[2] = -8;
	        Sortedarr[3] = -7;
	        Sortedarr[4] = -2;

	        arr = temp1.basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, temp1.basicSelectionSort(arr));
	    }

	    public void testMixed(){

	    	SelectionSort temp1 = new SelectionSort();

	    	int[] arr = new int[5];
	        arr[0] = 0;
	        arr[1] = -9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = -2;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = -9;
	        Sortedarr[1] = -2;
	        Sortedarr[2] = 0;
	        Sortedarr[3] = 7;
	        Sortedarr[4] = 10;

	        arr = temp1.basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, temp1.basicSelectionSort(arr));
	    }

	    public void testDuplicates()
	    {
	    	SelectionSort temp1 = new SelectionSort();

	    	int[] arr = new int[5];
	        arr[0] = 2;
	        arr[1] = 8;
	        arr[2] = 8;
	        arr[3] = 2;
	        arr[4] = 8;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 2;
	        Sortedarr[1] = 2;
	        Sortedarr[2] = 8;
	        Sortedarr[3] = 8;
	        Sortedarr[4] = 8;

	        arr = temp1.basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, temp1.basicSelectionSort(arr));
	    }



}
