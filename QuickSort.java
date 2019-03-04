public class QuickSort implements SortingAlgorithm
{
	// This is the sort method that calls the quick sort.
	public void sort(int [] a)
	{
		int left = 0;
		int right = a.length-1;
		quicksort(a,left,right);	
	}



	// this is the quick sort. Firsly find the position of a pivot in this array and then keep sorting its left side array and right side array.
	public void quicksort(int [] a, int left, int right)
	{
		if (left < right)
		{
			int pivot = partition(a, left, right);
			quicksort(a,left, pivot-1);
			quicksort(a,pivot+1,right);
		}

	}

	// this is the method to find a pivot
	// first choose the leftmost cell as a pivot. 
	// Then place the numbers that is smaller than it on its left, that is greater than it on its right.
	// Finally swap the pivot to its true position
	public int partition(int [] a, int left, int right)
	{
		int pivot = left;
		int i = left+1;
		int j = right;



		while(i < j)
		{
			while ((j > i) && (a[j] >= a[pivot]))
			{
				j--;
			}
			while((i < j) && (a[i] < a[pivot]))
			{
				i++;
			}
			if(i < j)
			{
				swap(a,i,j);
			}
		}
		
		if (a[pivot] > a[i])
		{
			swap(a,pivot,i);
			return i;
		}
	
		return pivot;
	

	}

	// this is the swap method, let two elements in an array exchange their values.
	public void swap(int [] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
}