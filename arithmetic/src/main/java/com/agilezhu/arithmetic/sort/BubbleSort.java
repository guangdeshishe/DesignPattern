package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 核心思想：对待排序序列中的相邻的两个元素比较，如果左边的大于右边的则交换位置，一轮比较下来最大的元素会移动到待排序序列中最后面，如此往复直到没有元素需要交换为止
 * 时间复杂度：最好情况o(n),最差情况o(n2),平均o(n2)
 * 空间复杂度：o(1)
 * 稳定性：稳定
 * 适合情况：
 *
 * @author zhujie
 * @date 2019-09-28
 * @time 23:21
 */
public class BubbleSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    private static void sort(int... arr) {
        for (int i = arr.length - 1; i > -0; i--) {
            boolean hasChanged = false;//标记一轮比较后是否有交换过元素
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    hasChanged = true;
                }
            }
            System.out.println((index++) + ":" + Arrays.toString(arr));
            if (!hasChanged) {//如果没有交换过元素说明序列已经有序了，则退出循环
                break;
            }
        }
    }
}
