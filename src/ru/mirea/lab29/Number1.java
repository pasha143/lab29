package ru.mirea.lab29;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] roads = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }
        int roadCount = countRoads(roads, n);
        System.out.println(roadCount);
    }

    public static int countRoads(int[][] roads, int n) {
        int roadCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roadCount += roads[i][j];
            }
        }
        return roadCount / 2;
    }
}
