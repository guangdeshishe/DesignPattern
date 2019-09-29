package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 核心思想：通过一个增量将序划分成多个序列，然后对每个序列使用插入排序使得它们有序，这个增量值一般从元素总个数的一半开始，每次循环都减少一半，一直到增量值1时执行最后一次插入排序以完成整个序列的排序
 * 时间复杂度:最好情况o(n),最差情况o(n2),平均o(nlog2n)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 * 适合情况：属于插入排序算法的升级版，提高了待排序元素个数较多时效率问题
 *
 * @author zhujie
 * @date 2019-09-23
 * @time 09:57
 */
public class ShellSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    public static void sort(int... arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {//不断缩小gap，直到1为止
            //对子序列进行直接插入排序
            for (int i = 0; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {

                    if (arr[j] > arr[j + gap]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = tmp;
                        System.out.println((index++) + ":" + Arrays.toString(arr));
                    } else {
                        break;
                    }
                }
            }
            gap = gap / 2;
        }

    }

}
