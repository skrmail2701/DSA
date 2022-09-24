package sorting_algos;

public class MergeSort {

	public static void main(String[] args) {
	int nums[]= {4,6,21,1,49};
	mergeSortInt(nums,0,nums.length-1);
	for(int i: nums) {
		System.out.println(i);
	}
	}

	private static void mergeSortInt(int[] nums, int start, int end) {
		int mid=(start+end)/2;
		if(start==end) {
			return;
		}
		mergeSortInt(nums, start, mid);
		mergeSortInt(nums, mid+1, end);
		mergeDivided(nums,start,mid,end);
	}

	private static void mergeDivided(int[] nums, int start, int mid, int end) {
		int temp[]= new int[end-start+1];
		int tempIndex=0;
		int i=start;
		int j=mid+1;
		while(i<=mid && j <=end) {
			if(nums[i]<nums[j]) {
				temp[tempIndex++]=nums[i++];
			}
			else {
				temp[tempIndex++]=nums[j++];
			}
			
		}
		while(i<=mid) {
			temp[tempIndex++]=nums[i++];
		}
		while(j<=end) {
			temp[tempIndex++]=nums[j++];
		}
		for(int p=0;p<temp.length;p++) {
			nums[start++]=temp[p];
		}
		}

}
