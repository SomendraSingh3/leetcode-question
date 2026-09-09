class Solution {
    public int search(int[] nums, int target) {

        int fir = 0;
        int last = nums.length - 1;

        while (fir <= last) {

            int mid = fir + (last - fir) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[fir] <= nums[mid]) {

                if (nums[fir] <= target && target < nums[mid]) {
                    last = mid - 1;
                } 
                else {
                    fir = mid + 1;
                }
            }

            else {

                if (nums[mid] < target && target <= nums[last]) {
                    fir = mid + 1;
                } 
                else {
                    last = mid - 1;
                }
            }
        }

        return -1;
    }
}