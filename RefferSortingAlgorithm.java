class test1
{
	void buble(int arr[],int n)
	{

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
	
				}
			}
		}
	}
	
		void selection(int arr[], int n)
		{
			for(int i=0;i<n-1;i++)
			{
				int min = i;
				for(int j=i+1;j<n;j++)
				{
					if(arr[min]>arr[j])
					min=j;
				}		
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				
			}
		}
		
		
		void insertion(int arr[],int n)
		{
			int j;
			for(int i=1;i<n;i++)
			{
				int temp = arr[i];
				for(j=i-1; j>=0 && arr[j]>temp;j--)
				{ arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}
		
		
	void quicksort(int arr[],int low , int high)
		{
				if(low>=high)
				{ return;}
			int start=low;
			int end = high;
			int mid = start +(end-start)/2;
			int pivot = arr[mid];
			while(start<=end)
			{
				while(arr[start]<pivot)
				{
					start++;
				}
				
				while(arr[end]>pivot)
				{
					end--;
				}
				
				if(start<=end)
				{
					int temp = arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
				
			}
			quicksort(arr,low,end);
			quicksort(arr,start,high);
		}
		
	void mergesort(	
		
public static void main (String args[])
	{
		test1 n1 = new test1();
		
	int arr[]= { 5,2,7,3,6,8,1,-5,-1};
		int n = arr.length;
		System.out.println("Before Sorting ");
		for(int i=0;i<n;i++)
		{
		   System.out.print(arr[i]);
		}
		
		//n1.buble(arr,n);
		//n1.selection(arr,n);
		n1.quicksort(arr,0,n-1);
		//n1.insertion(arr,n);
		
	 System.out.println("after Sorting ");
		for(int i=0;i<n;i++)
		{
		   System.out.print(arr[i]);
		}
	
	}
}
