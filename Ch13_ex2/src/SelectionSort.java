
public class SelectionSort {
	public static void sort(Comparable[]array, int numberUsed )
	{
		int index, indexOfNextSmallest;
		
		for(index =0; index < numberUsed; index++ )
		{
			indexOfNextSmallest = indexOfNextSmallest(index, array, numberUsed);
			interchange(index, indexOfNextSmallest, array);
		}
	}
		
	private static int indexOfNextSmallest(int startIndex, Comparable[]array, int numberUsed)
	{
			
			Comparable min = array[startIndex];
			int indexOfMin = startIndex;
			int index;
			for(index = startIndex +1; index < numberUsed; index++)
				
				if(array[index].compareTo(min) < 0)
				{
					min = array[index];
					indexOfMin = index;
					
				}
			
			return indexOfMin;
		}
	
	private static void interchange(int i, int j, Comparable[]array)
	{
		Comparable temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}	
		
		
}
