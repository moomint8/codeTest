package backjoon.stepByStepLearning.SortAlgorithms;

/*
힙 정렬
시간복잡도 : n log n
 */

import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int num = 100000;
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = random.nextInt(num) + 1;
        }

        long startTime = System.currentTimeMillis();
        HeapSort(testcase, testcase.length);
        long endTime = System.currentTimeMillis();

        System.out.println("정렬 소요 시간 : " + (endTime - startTime) + "s");
        CheckSort(testcase, num);
    }

    private static void HeapSort(int a[], int size) {
        if (size < 2) {
            return;
        }

        int parentIdx = getParent(size - 1);

        for (int i = parentIdx; i >= 0; i--) {
            heapify(a, i, size - 1);
        }

        for(int i = size - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, 0, i - 1);
        }
    }

    private static void heapify(int a[], int parentIdx, int lastIdx) {
        int leftChildIdx = 2 * parentIdx + 1;
        int rightChildIdx = 2 * parentIdx + 2;
        int largestIdx = parentIdx;

        if (leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
            largestIdx = leftChildIdx;
        }

        if (rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
            largestIdx = rightChildIdx;
        }

        if (parentIdx != largestIdx) {
            swap(a, largestIdx, parentIdx);
            heapify(a, largestIdx, lastIdx);
        }
    }

    private static int getParent(int child) {
        return (child - 1) / 2;
    }

    private static void CheckSort(int arr[], int num) {
        boolean isSorted = true;

        for (int i = 0; i < num - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("정렬 완료");
        } else {
            System.out.println("정렬 오류 발생");
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
