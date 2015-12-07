/**
 * 
 */
package org.naresh.javariders;

/**
 * @author nchinthakindi
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	
		 int unSortedArray[] = {5,6,2,1,-10,19};

		 int sortedArray[] = bubbleSort(unSortedArray);
		 
		 System.out.println("UnSorted Values "+unSortedArray);
		 for (int i : sortedArray) 
		 {
			System.out.println("val "+i);
		 }
	}

	private static int[] bubbleSort(int[] array)
	{
		int arrayLenghth = array.length;
		int k;
		
		for(int i = arrayLenghth; i > 0;i--)
		{
			for(int j = 0; j < i-1;j++)
			{
				k = j+1;
				
				if(array[j] > array[k])
				{
					swapValues(j,k,array);
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
