package com.agilezhu.arithmetic.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 核心思想：每次将待排序序列构建成大顶堆，然后将堆顶元素放到待排序序列的最后面
 * 时间复杂度：最好情况o(nlog2n),最差情况o(nlog2n),平均o(nlog2n)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 * 适用情况：
 * <p>
 * 堆的概念：在完全二叉树基础上，所有非叶子结点都大于它的左右子结点(大顶堆),或者小于它的左右子结点(小顶堆)
 * 树的概念：由结点和边构成且不存在任何环的数据结构
 * 二叉树：每个结点最多有两个子结点的树
 * 完满二叉树：除了叶子结点之外的其他结点，都有两个子结点，每一层都可以不填满
 * 完全二叉树：除了最后一层外，其他每一层都被完全填满，且所有结点都保持左对齐，如果某个结点只有右子结点而没有左子结点则不行
 * 完美二叉树：除了叶子结点以外其他结点都有两个子结点，而且每一层都被完全填满
 * <p>
 * 当前结点的父结点：(i-1)/2
 * 当前父结点的左子结点：2*i + 1
 * 当前父结点的右子结点：2*i+2
 *
 * @author zhujie
 * @date 2019-09-28
 * @time 21:17
 */
public class HeapSort {
    static int index = 1;

    public static void main(String[] args) {
        sort(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }

    private static void sort(int... arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            maxHeapify(arr, i);//构建大顶堆
            //将堆顶元素与待排序序列中最后一个元素交换位置
            System.out.println((index++) + ":" + Arrays.toString(arr));

            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;

            System.out.println((index++) + ":" + Arrays.toString(arr));
        }
    }

    //构建大顶堆，i表示待排序序列中最后元素位置
    private static void maxHeapify(int[] arr, int i) {
        int parentIndex = (i - 1) / 2;//最后一个结点的父结点

        for (; parentIndex >= 0; parentIndex--) {
            int leftChildIndex = parentIndex * 2 + 1;//左子结点
            int rightChildIndex = leftChildIndex + 1;//右子结点
            if (rightChildIndex > i) {//如果没有右子结点，则赋值予左结点
                rightChildIndex = leftChildIndex;
            }
            //对比左右子结点，找出最大的那个结点位置
            int maxChildIndex = arr[leftChildIndex] > arr[rightChildIndex] ? leftChildIndex : rightChildIndex;
            //为了构建大顶堆，如果子结点最大的那个大于父结点的值，则交换位置
            if (arr[maxChildIndex] > arr[parentIndex]) {
                int tmp = arr[maxChildIndex];
                arr[maxChildIndex] = arr[parentIndex];
                arr[parentIndex] = tmp;
            }

        }

    }
}
