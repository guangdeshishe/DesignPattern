package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 核心思想：依次从待排序序列中取出元素，插入到已排序序列中最后一个比它小的元素后面
 * 时间复杂度：最好情况o(n),最差情况o(n2),平均o(n2)
 * 空间复杂度：o(1)
 * 稳定性：稳定
 * 适合情况：基本有序且元素个数较少情况
 *
 * @author zhujie
 * @date 2019-09-23
 * @time 09:57
 */
public class InsertionSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    static void sort(int... arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            //从右往左遍历已排序序列，如果比当前元素大则交换元素
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
