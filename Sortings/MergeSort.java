import java.io.InputStreamReader;
import java.io.BufferedReader;
class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int index, int m, int length)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - index + 1;
        int n2 = length - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[index + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = index;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int index, int length)
    {
        if (index < length)
        {
            // Find the middle point
            int m = (index+length)/2;
 
            // Sort first and second halves
            sort(arr, index, m);
            sort(arr , m+1, length);
 
            // Merge the sorted halves
            merge(arr, index, m, length);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {	
		try{
		int size=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array:");
		size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
		}catch(Exception e)
		{e.printStackTrace();}
    }
}