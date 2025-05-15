class Q3
{
	static int firstocc(int[] arr,int key1)
	{
		int s=0;
		int e=arr.length-1;
		int first=-1;
		if(s<=e)
		{
			int mid=s+(e-s)/2;
			if(arr[mid]==key1){
				first=mid;
		          e=mid-1;
			
			}else 
				if(arr[mid]<key1)
			{
				s=mid+1;
			}
			else{
				e=mid-1;
			}
		}
		return first;
		
	}
	static int keyindex(int[] arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		if(s<e)
		{
			int mid=s+(e-s)/2;
			if(arr[mid]==key){
				return mid;
			
			}else if(arr[mid]>key)
			{
				e=mid-1;
			}
			else{
				s=mid+1;
			}
		}
		return -1;
		
	}
	
static int count(int arr[],int key)
{
	int c=0;
  for(int i=0;i<arr.length;i++)
  {
	  if(arr[i]==key)
	  {
		  c++;
	  }
  }
  return c;
}
static int peakelement(int arr1[]){
        	int start=0;
        	int end=arr1.length-1;
        	while(start<end){
            		int mid=start+(end-start)/2;
            		if(arr1[mid]>arr1[mid+1])
                		end=mid;
            		else
                		start=mid+1;

        	}
        	return arr1[start];
    	}
public static void main(String args[])
{
int arr[]=new int[]{1,3,3,3,5,6,8};
int n=count(arr,3);
System.out.println(n);
//*****************************************
int arr1[]=new int[]{1,2,18,4,5,0};
int res=peakelement(arr1);
System.out.println(res);
//***********************************************
int key=3;
int res2=keyindex(arr, key);
System.out.println(res2);
//********************************************
int key1=3;
int res3=firstocc(arr,key1);
System.out.println(res3);
}
}