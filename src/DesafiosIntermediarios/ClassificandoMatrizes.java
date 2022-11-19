package DesafiosIntermediarios;

import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, aux;

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (i = 0; i < N; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = (i + 1); j < N; j++) {
                    if (nums[j] % 2 == 0) {
                        aux = nums[i];
                        nums[i] = nums[j];
                        nums[j] = aux;
                        j = N;
                    }
                }
            }
        }
        for (i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
    }
}