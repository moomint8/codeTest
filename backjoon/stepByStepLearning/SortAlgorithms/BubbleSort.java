package backjoon.stepByStepLearning.SortAlgorithms;

/*
버블 정렬
시간복잡도 : n^2
 */

import java.io.*;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = Integer.parseInt(reader.readLine());
        }

        testcase = BubbleSort(testcase, testcase.length);

        for (int i = 0; i < num; i++) {
            writer.write(testcase[i] + "\n");
        }

        writer.flush();
        writer.close();
    }

    private static int[] BubbleSort(int arr[], int len) {
        int tmp;

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }
}
