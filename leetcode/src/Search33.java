public class Search33 {
    public int search(int[] nums, int target) {
        return helper(nums, 0, nums.length - 1, target);
    }
    private int helper(int[] nums, int left, int right, int target){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(target == nums[mid]) return mid;
        if(nums[left] > nums[mid]){
            if(target > nums[mid]){
                if(target == nums[left]){
                    return left;
                }
                else if(target > nums[left]){
                    return helper(nums, left + 1, mid - 1, target);
                }
                else{
                    return helper(nums, mid + 1, right, target);
                }
            }
            else{
                return helper(nums, left, mid - 1, target);
            }
        }
        else if(nums[left] < nums[mid]){
            if(nums[mid] > target){
                if(nums[left] == target){
                    return left;
                }
                else if(nums[left] < target){
                    return helper(nums, left + 1, mid - 1, target);
                }
                else{
                    return helper(nums, mid + 1, right, target);
                }
            }
            else{
                return helper(nums, mid + 1, right, target);
            }
        }
        else{
            if(right == left) return -1;
            else {
                if(nums[right] == target) return right;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Search33 impl = new Search33();
        int[] nums = {5,1,2,3,4};
        System.out.println(impl.search(nums, 1));
    }
}
