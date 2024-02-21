# Day1-Array-Part1
第一章  数组part01


 今日任务 

数组理论基础，

704. 二分查找 (  https://leetcode.cn/problems/binary-search/  )，

左闭右闭 ：
while 判断 left <= right
if (nums[middle] > target) right 要赋值为 middle - 1
if (nums[middle] < target) right 要赋值为 middle + 1

左闭右开
while 判断 left < right 因为右边是开的
if (nums[middle] > target) right 要赋值为 middle
if (nums[middle] < target) right 要赋值为 middle + 1

27. 移除元素 (  https://leetcode.cn/problems/remove-element/  )
快慢指针
