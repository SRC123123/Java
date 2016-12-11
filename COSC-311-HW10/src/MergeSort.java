//http://tinyurl.com/gtykdcc
//Source Code: http://tinyurl.com/jbqed2z

public class MergeSort
{
	private int counter;
	
	public MergeSort()
	{
		counter = 0;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	//Merge Sort Public Method
	//Creates an array of same length and calls sort.
	public void mergeSort(String [ ] a)
	{
		String[] tmp = new String[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}
		
	//Merge Sort Private Method
	//Performs the recursive call.
	private void mergeSort(String [ ] a, String [ ] tmp, int left, int right)
	{   
		counter++;
		
		//if left !< right then they both = 0 and there is only one element end calls
		//else, find center of array and split it, calling mergeSort on each half
		//then merge each half back together.
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}

	//Merge Method
	//Sorts and merges the elements of two arrays into one array.
    private void merge(String[ ] a, String[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;
        
        //Comparing and placing the lesser of the two elements in tmp
        //until one array has exhausted all of its elements
        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];
        
        //Copy the rest of the remaining array to tmp
        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 }