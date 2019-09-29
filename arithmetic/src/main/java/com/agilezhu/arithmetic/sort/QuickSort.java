package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 核心思想：选取待排序序列中第一个元素作为基准值，将所有比它大的元素交换到基准值的右侧，所有比它小的元素都交换到基准值的左侧，然后它左侧和右侧序列再递归重复前面步骤，直到需要待排序元素个数为0或者1
 * 时间复杂度：最好情况o(nlog2n),最差情况o(n2),平均o(nlog2n)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 * 适合情况：越是无序的数列效率越高
 *
 * @author zhujie
 * @date 2019-09-28
 * @time 23:57
 */
public class QuickSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 0, 8);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int left = low;//低位游标
        int right = high;//高位游标
        int tmp = arr[left];//保存基准值，留出空位
        while (left < right) {//当高位和低位游标相等时结束
            while (left < right && arr[right] >= tmp) {//高位游标往左移动，直到有一个元素小于基准值，或者高位和低位游标相等为止
                right--;
            }
            arr[left] = arr[right];//将右侧小于基准值的元素放入left空位，right位置留出空位
            while (left < right && arr[left] <= tmp) {//低位右边往右移动，直到有一个元素大于基准值，或者高位和低位游标相等为止
                left++;
            }
            arr[right] = arr[left];//将左侧大于基准值的元素放入right空位，left位置留出空位
        }
        arr[left] = tmp;//将基准值放入游标相等位置，此时left等于right，大于基准值的元素都在右侧，小于基准值的元素都在左侧
        System.out.println((index++) + ":" + Arrays.toString(arr));
        sort(arr, low, left - 1);//基准值左侧元素进行快速排序
        sort(arr, left + 1, high);//基准值右侧元素进行快速排序
    }
}
