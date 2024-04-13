package com.creat;

import java.util.concurrent.ThreadLocalRandom;

/**
 * ClassName: Arry
 * Package: com.creat
 * Description:
 *
 * @Author Joe
 * @Create 2024-04-05 17:52
 * @Version
 */
public class Arry {
    public static void main(String[] args) {
        Arry arry = new Arry();
        arry.test();
    }

    int[] arr = new int[10];
    int[] arr2 = new int[]{0,3,0};
    int[] arr1 = {1,6,3,4,2};
    public Arry(){

    }
    public void test(){
        Arry arry = new Arry();
        arry.randomAccess(arr2);
    }
    /**
     * 随机访问数组
     * 时间复杂度：O(1)
     * @param nums
     * @return int
     */
    public int randomAccess(int[] nums){
        //从数组中随机抽数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0,nums.length);
        int randomNum = nums[randomIndex];
        return randomNum;
    }

    /**
     * 数组插入
     * 时间复杂度：O(n)
     * @param nums
     * @param index
     * @param num
     */
    public void insert(int[] nums,int index,int num){
        //把索引index之后的元素向后移动
        for(int i = nums.length-1;i>index;i--){
            // 将 num 赋给 index 处的元素
            nums[i] = nums[i-1];
        }
        nums[index] = num;
    }
    /* 删除索引 index 处的元素
    * 时间复杂度：O(n)
    * */

    public void remove(int[] nums, int index) {
        // 把索引 index 之后的所有元素向前移动一位
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    /* 遍历数组
    * 时间复杂度：O(n)*/
    public void traverse(int[] nums) {
        int count = 0;
        // 方式1：通过索引遍历数组
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        // 方式2：直接遍历数组元素
        for (int num : nums) {
            count += num;
        }
    }
    /* 在数组中查找指定元素
    * 时间复杂度：O(n)
    * */
    public int find(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
    /* 扩展数组长度
    * 时间复杂度：O(n)
    *  */
    public int[] extend(int[] nums, int enlarge) {
        // 初始化一个扩展长度后的数组
        int[] res = new int[nums.length + enlarge];
        // 将原数组中的所有元素复制到新数组
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        // 返回扩展后的新数组
        return res;
    }
}
