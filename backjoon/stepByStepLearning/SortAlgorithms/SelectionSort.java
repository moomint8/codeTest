package backjoon.stepByStepLearning.SortAlgorithms;

/*
선택 정렬
시간복잡도 : n^2
 */

import java.io.*;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = Integer.parseInt(reader.readLine());
        }

        testcase = SelectionSort(testcase, testcase.length);

        for (int i = 0; i < num; i++) {
            writer.write(testcase[i] + "\n");
        }

        writer.flush();
        writer.close();
    }

    private static int[] SelectionSort(int arr[], int len) {
        int tmp, minLoc;

        for (int i = 0; i < len - 1; i++) {
            minLoc = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minLoc]) {
                    minLoc = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minLoc];
            arr[minLoc] = tmp;
        }

        return arr;
    }
}
