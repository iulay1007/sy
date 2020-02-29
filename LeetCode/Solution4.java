
public class Solution4 {
	
	public int removeDuplicates(int[] nums) {
		int l=nums.length;
		if(l==0)
			return 0;
		int a=0 ;
		int b=1;
		for(b=1;b<l;b++)
		{
			if(nums[a]!=nums[b])
			{
				nums[a+1]=nums[b];
				a++;	
					
			}
		}
				
		return a+1;
		
		 }

}
