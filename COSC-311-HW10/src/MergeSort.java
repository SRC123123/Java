
//Source Code: http://tinyurl.com/jbqed2z

public class MergeSort
{
	private static int counter;
	
	public MergeSort()
	{
		counter = 0;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	public static void mergeSort(String [ ] a)
	{
		String[] tmp = new String[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

	private static void mergeSort(String [ ] a, String [ ] tmp, int left, int right)
	{   
		counter++;
		
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}

    private static void merge(String[ ] a, String[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 }