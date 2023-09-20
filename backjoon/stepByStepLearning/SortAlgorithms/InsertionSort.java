package backjoon.stepByStepLearning.SortAlgorithms;

/*
삽입 정렬
시간복잡도 : n^2
 */

import java.io.*;

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = Integer.parseInt(reader.readLine());
        }

        testcase = InsertionSort(testcase, testcase.length);

        for (int i = 0; i < num; i++) {
            writer.write(testcase[i] + "\n");
        }

        writer.flush();
        writer.close();
    }

    private static int[] InsertionSort(int arr[], int len) {
        int tmp;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    continue;
                } else {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}
