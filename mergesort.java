void divide ( int arr[], int start ,int end)
{
if(start>=end){
return};

int middle = start +(end-start)/2;
divide(arr,start,middle);
devide(arr,middle+1,end);
conquer(arr,start,middle,end);
}

void conquer(int arr[],int start, int middle, int end)
{
int merged[] = new int [end-start+1];
int idx1= start;
int idx2 = middle+1;
int x = 0;

while(idx1 <=middle && idx2 <=end)
{
if(arr[idx1] <= arr[idx2]
	{	merged[x++]= arr[idx1++];
		}
else
	{ merged[x++]=arr[idx2++];
		}
}

while(idx1<=mid){
merged[x++] = arr[idx1++];
}

while(idx <= ei){
merged[x++] = arr[idx2++];
}

while(idx2 <=ei) {
merged[x++] = arr[idx2++];
}

	for(int i = 0; j=si; i<merged.length;i++, j++;)
	{
	arr[j] = merged[i];
	}
}
