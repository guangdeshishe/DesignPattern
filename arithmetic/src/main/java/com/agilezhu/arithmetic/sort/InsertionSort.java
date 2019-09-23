package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * <p>
 * 3.1 算法描述
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 * <p>
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 *
 * <p>
 * 平均时间复杂度：O(n2)
 * 最好情况：O(n)
 * 最坏情况：O(n2)
 * 空间复杂度：O(1)
 * <p>
 * 稳定排序
 *
 * @author zhujie
 * @date 2019-09-23
 * @time 09:57
 */
public class InsertionSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9,8, 7, 6, 5, 4, 3, 2, 1);
    }

    static void sort(int... arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[j + 1]) {
                    break;
                }
                int tmp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = tmp;

                System.out.println((index++) + ":" + Arrays.toString(arr));
            }

        }
    }

}
