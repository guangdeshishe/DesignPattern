package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 核心思想：每次从待排序序列中选择最小的元素放在待排序序列最前面
 * 时间复杂度：最好情况o(n2),最差情况o(n2),平均o(n2)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 * 适用情况：
 *
 * @author zhujie
 * @date 2019-09-28
 * @time 10:12
 */
public class SelectSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    private static void sort(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //选出之后待排序中值最小的位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //将最小的值与待排序序列中最前面元素交换
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;

                System.out.println((index++) + ":" + Arrays.toString(arr));
            }
        }
    }
}
