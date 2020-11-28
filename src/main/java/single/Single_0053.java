package single;

public class Single_0053 {

	public static void main(String[] args) {
		
		int[] nums = {-3,-2,0,1,-1};

		System.out.println(maxSubArray(nums));
		
	}
	public static int maxSubArray(int[] nums){
		int max = nums[0];
		int thisNums = 0;
		for(int i = 0; i < nums.length-1; i++){
			if(nums[i+1] > nums[i]){
				max = nums[i+1];
			}
		}
		for(int i = 0; i < nums.length; i++){
			thisNums += nums[i];	
			if(thisNums > max){
				max = thisNums;	
			}else if(thisNums < 0){
				thisNums = 0;
			}
		}
		return max;
	}

}
