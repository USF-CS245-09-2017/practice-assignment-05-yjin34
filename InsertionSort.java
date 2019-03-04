public class InsertionSort implements SortingAlgorithm
{

	// this is the insertion sort. 
	// Assume the first element is already sorted. Gradually put the rest elements into this sorted array one by one
	public void sort(int [] a)
	{
		int temp,j;
		for(int i = 1; i < a.length; i++)
		{
			temp = a[i];
			j = i - 1;
			while(j >= 0 && a[j] > temp)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;

		}
	}
}