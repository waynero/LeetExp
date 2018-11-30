public class WiggleSort {
    public void wiggleSort(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int[] temp = new int[nums.length];
        int left = 0;
        int n = nums.length;
        int right = (n | 1) - 2;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > median){
                temp[right] = nums[i];
                right -= 2;
            }
            if(nums[i] < median){
                temp[left] = nums[i];
                left += 2;
            }
        }
        while(left < nums.length){
            temp[left] = median;
            left += 2;
        }
        while(right >= 0){
            temp[right] = median;
            right -= 2;

        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
    private int findKthLargest(int[] nums, int target){
        return target;
    }
}
