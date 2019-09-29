package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 核心思想：将待排序序列递归拆分成两个序列，直到每个序列元素个数都小于等于1，然后再将拆分后的序列递归合两两合并为一个有序序列，最终使得整个序列有序
 * 时间复杂度：最好情况o(nlog2n),最差情况o(nlog2n),平均o(nlog2n)
 * 空间复杂度：o(n)
 * 稳定性：稳定
 *
 * @author zhujie
 * @date 2019-09-29
 * @time 09:53
 */
public class MergeSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    static int[] sort(int... arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int split = arr.length >> 1;//等价于arr.length/2
        //拆分成两个序列
        int[] leftArr = Arrays.copyOfRange(arr, 0, split);
        int[] rightArr = Arrays.copyOfRange(arr, split, arr.length);

        //将拆分后的序列两两合并成一个有序序列
        int[] result = mergeArray(sort(leftArr), sort(rightArr));
        System.out.println((index++) + ":" + Arrays.toString(result));
        return result;
    }

    private static int[] mergeArray(int[] leftArr, int[] rightArr) {
        //合并后的序列
        int[] result = new int[leftArr.length + rightArr.length];
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                result[k++] = leftArr[i++];
            } else {
                result[k++] = rightArr[j++];
            }
        }
        //将剩下的序列放入合并后的序列中
        while (i < leftArr.length) {
            result[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            result[k++] = rightArr[j++];
        }
        return result;

    }
}
