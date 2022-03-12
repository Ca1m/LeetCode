package single.range_200;

/**
 * 283. 移动零
 */
public class Single_0283 {

    public static void main(String[] args) {

        int[] nums = new int[]{5,1,0,3,12};
        new Single_0283().moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + ",");
        }
    }

    public void moveZeroes(int[] nums) {

        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                if (left != right) {
                    swap(nums, left, right);
                }
                left++;
            }
            right++;
        }
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
