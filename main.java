//Leetcode 704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index;
        while(left <= right){
            index = left + (right - left) / 2;
            if(nums[index] == target) return index;
            else if(nums[index] > target) right = index - 1;
            else left = index + 1;
        }
        return -1;
    }
}

// Time: O(logN) Space: O(1) 左闭右闭


class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int index;
        while(left < right){
            index = left + (right - left) / 2;
            if(nums[index] == target) return index;
            else if(nums[index] > target) right = index;
            else left = index + 1;
        }
        return -1;
    }
}

// Time: O(logN) Space: O(1) 左闭右开



//LeetCode 27 remove element

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}

// 快慢指针 Time: O(N) Space: O(1)
