class Array13
{
	public static void sortArray(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}


		}
		System.out.println("Sorted array:: ");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}
	public static void main(String ... args)
	{
		int arr[]={4,2,3,1,5};
		sortArray(arr);
	}



}