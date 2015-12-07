/**
 * 
 */
package org.naresh.javariders;

/**
 * @author nchinthakindi
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int unSortedArray[] = {5,6,2,1,-10,19};

		 int sortedArray[] = selectionSort(unSortedArray);
		 
		 System.out.println("UnSorted Values "+unSortedArray);
		 for (int i : sortedArray) 
		 {
			System.out.println("val "+i);
		 }

	}

	private static int[] selectionSort(int[] array) 
	{
		int arrayLength = array.length;
		
		for (int i = 0; i < arrayLength-1; i++) 
		{
						
			for(int j = i+1; j<arrayLength;j++)
			{
				if(array[i] > array[j])
				{
					swapValues(j,i,array);
				}
			}
		}
		
		return array;
	}

	private static void swapValues(int j, int k, int[] array)
	{
		int temp = array[j];
		array[j] = array[k];
		array[k] = temp;
		
	}

}
