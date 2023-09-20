package backjoon.stepByStepLearning.SortAlgorithms;

/*
정렬 알고리즘 기본 Form
 */

import java.util.Random;

public class SortForm {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int num = 100000;
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = random.nextInt();
        }

        long startTime = System.currentTimeMillis();
        Sort(testcase, testcase.length);
        long endTime = System.currentTimeMillis();

        System.out.println("정렬 소요 시간 : " + (endTime - startTime));
        CheckSort(testcase, num);
    }

    private static void Sort(int arr[], int len) {

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

    private static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
