package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 希尔排序（Shell Sort），1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * <p>
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
 * <p>
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 *
 * <p>
 * 平均时间复杂度：O(n1.3)
 * 最好情况：O(n)
 * 最坏情况：O(n2)
 * 空间复杂度：O(1)
 * <p>
 * 不稳定排序
 *
 * @author zhujie
 * @date 2019-09-23
 * @time 09:57
 */
public class ShellSort {
    static int index = 1;

    public static void main(String[] args) {
        shellSort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    public static void shellSort(int... arr) {
        int gap = arr.length / 2;
        while (gap > 0) {      //不断缩小gap，直到1为止
            //对子序列进行直接插入排序
            for (int i = 1; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {
                    System.out.println((index++) + ":" + Arrays.toString(arr));
                    if (arr[j] > arr[j + gap]) {
                        swap(arr, j, j + gap);
                    } else {
                        break;
                    }
                }
            }
            gap /= 2;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];      //交换操作
        arr[j] = arr[i];
        arr[i] = temp;

    }


}
