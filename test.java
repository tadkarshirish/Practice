class test
	{
		
	static int count=0;
	
	static void swap(int a1[], int i, int j)
	{
		int temp = a1[i];
		a1[i] = a1[j];
		a1[j] = temp;
	}
	void Quicksort(int arr[],int low , int hi)
	{
		if(low >= hi)
		{ return;}
		int start = low;
		int end = hi;
		int middle = start + (end-start) / 2;
		int pivot = arr[middle];
	
	while(start <= end )
	{
		if(arr[start]<pivot)
		{	start++;}
		if(arr[end]>pivot)
		{ end--;}
		
		if(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	Quicksort(arr,low,end);
	Quicksort(arr,start,hi);
	
		}
	}
	
	
	void quicksort22(int arr[],int low , int high)
	{
		if(low>=high)
		{return;}
	int start = low;
	int end = high;
	int middle = start + (end - start) / 2;
	int pivot = arr[middle];
	
	while(start<=end)
	{
		while(arr[start]<pivot)
		{
			start ++;
		}
		while(arr[end]>pivot)
		{
			end --;
		}
		
		if(start <= end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	quicksort22(arr,low,end);
	quicksort22(arr,start,high);
	
	}
		
		
	
	
	
	/*
int partition(int arr[], int low , int high)
int pivot = arr[high];
int i = low-1;
	
	
	
		void Bubblesort(int arr[])
		{ 
			
			int n = arr.length;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1;j++)
				{ 
					if(arr[j]>arr[j+1])
					{
					int temp=arr[j];
					arr[j]=arr[j+1];
					  arr[j+1]=temp;
		
					}
					count++;
				}
			}
	}	
	
	
		
void Quicksort(int arr[],int low,int high)
{
	if(low<high)
	{
		int P = partition(arr,low,high);
		Quicksort(arr,low,P-1);
		Quicksort(arr,P+1,high);
	}
	
}

int partition(int arr[], int low , int high)
{
		int pivot=arr[low];
		int start =low;
		int end = high;
		
	while(start<end)
	{
	while(arr[start]<=pivot)
		{
			start++;
		}
	while(arr[end]>pivot && end<high)
		{
					System.out.print("  Entry nnnnn   ");
			end++;
		}
	if(start<end)
		{
			swap(arr,start,end);
		}
	}
	
	swap(arr,low,end);

	return end;

}	
*/
	
	
	
	void selectionsort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] < arr[min])
					min=j;
			}
				
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		
		}
	}
			
			
	
	
	/* void selectionsort(int a1[])
	{
		int n = a1.length; 
		for(int i=0;i<=n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min = j;
		}
		//swapping
				int temp = a1[min];
				a1[min] = a1[i];
				a1[i]=temp;
				
	}*/
	
	void insertionsort(int arr[])
	{
		int n=arr.length;
		int j;
		for(int i=1;i<n;i++)
	{
		int temp=arr[i];
		for( j=i-1;j>=0 && arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
			}
		arr[j+1]=temp;
	}
}
	
	void insers(int arr[])
	{
		int n=arr.length;
		int temp,i,j;
		for(i=1;i<n;i++)
		{
			temp=arr[i];
		for(j=i-1;j>=0 && arr[j]>temp; j--)
		{
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}}

	

	void display(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

  public static void main(String args[])
	{
		
		
		test s1 = new test();
		int arr[]={5,6,3,8,9,2,7,1,4};
		System.out.println("Before Sort ");
		int n= arr.length;
		System.out.print("  n   ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
	
		//s1.Bubblesort(arr);
		//s1.selectionsort(arr);
		//s1.insertionsort(arr);
		//s1.insers(arr);
		//s1.Quicksort(arr,0,n-1);
		s1.quicksort22(arr,0,8);
		System.out.println("After Sort ");
		s1.display(arr);
		
		System.out.println("Total Count "+count);	

	}
	
}
		