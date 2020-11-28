package single;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Single_0035 {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 0;

		System.out.println(searchInsert(nums,target));
		
	}

	public static int searchInsert(int[] nums, int target) {
        
		Integer[] is = ArrayUtils.toObject(nums);
		List<Integer> asList = Arrays.asList(is);
		
		return asList.indexOf(target);
    }
	
}
