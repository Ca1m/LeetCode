package single;

public class Single_0027 {

	public static void main(String[] args){
		
		int[] nums = {2,3,2,1,5,2};
		
		int len = removeElement(nums,2);
		for(int i = 0;i < len; i++){
			System.out.println(nums[i]);
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0){
			return 0;
		}
		int i = 0;
		for(int j = 0; j < nums.length; j++){
			if(nums[j] != val){
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
