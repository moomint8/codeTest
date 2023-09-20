package backjoon.stepByStepLearning.SortAlgorithms;

/*
합병정렬
시간복잡도 : n log n
 */

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int num = 100000;
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = random.nextInt();
        }

        long startTime = System.currentTimeMillis();
        MergeSort(testcase, 0, testcase.length - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("정렬 소요 시간 : " + (endTime - startTime));
        CheckSort(testcase, num);
    }

    private static void MergeSort(int arr[], int start, int end) {
        if (end > start) {
            int mid = (start + end) / 2;
            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);
            Merge(arr, start, mid, end);
        }
    }

    private static void Merge(int arr[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;

        int[] temp = new int[end + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        if (i > mid) {
            for (int p = j; p <= end; p++) {
                temp[k] = arr[p];
                k++;
            }
        } else {
            for (int p = i; p <= mid; p++) {
                temp[k] = arr[p];
                k++;
            }
        }

        for (int p = start; p <= end; p++) {
            arr[p] = temp[p];
        }
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
}