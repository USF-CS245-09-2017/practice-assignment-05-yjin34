public class MergeSort implements SortingAlgorithm
{
	// this is the merge sort
	// gradually split the array into n arrays of size 1 and then merge them together to be the sorted array
	public void sort(int [] a)
	{
		if (a.length > 1)
		{
			int [] left = getLeft(a);
			int [] right = getRight(a);
			sort(left);
			sort(right);
			merge(left,right,a);
		}
	}

	// this is the left side when an array is divided into two 
	public int[] getLeft(int[] a)
	{
		int[] left = new int[a.length/2];
		for (int i = 0; i < left.length; i++)
		{
			left[i] = a[i];
		}


		return left;
	}

	// this is the right side when an array is divided into two
	public int [] getRight(int[] a)
	{
		int[] right = new int[a.length - a.length/2];
		for (int i = 0; i < right.length; i++)
		{
			right[i] = a[i+a.length/2];
		}

		return right;
	}

	// this is the merge method
	// gradually put the elements inside the left array and the right array into the array a from the smallest number to the biggest number
	public void merge(int[] left, int[] right, int[] a)
	{
		int pointer_left = 0,pointer_right = 0,pointer_a = 0;
		while(pointer_left < left.length && pointer_right < right.length)
		{
			if (left[pointer_left] <= right[pointer_right])
			{
				a[pointer_a++] = left[pointer_left++];
			}
			else
			{
				a[pointer_a++] = right[pointer_right++];
			}
		}

		while(pointer_left < left.length)
		{
			a[pointer_a++] = left[pointer_left++]; 
		}

		while(pointer_right < right.length)
		{
			a[pointer_a++] = right[pointer_right++];
		}
	}

}