package com.mehrdad.falahati.algorithms.array;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * leetcode number 200
 * <a href="https://leetcode.com/problems/number-of-islands/">leetcode200</a>
 */
public class NumberOfIslandsSolution {

    private final int[][] directions = {
            {-1, 0}, //up
            {0, 1}, //right
            {1, 0}, //down
            {0, -1} //left
    };
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int count = 0;
        for (var row = 0; row < grid.length; row++) {
            for (var col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    grid[row][col] = '0';
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[] {row,col});
                    while (!queue.isEmpty()) {
                        checkQueueValueWithDirections(grid, queue);
                    }
                }
            }
        }
        return count;
    }

    private void checkQueueValueWithDirections(char[][] grid, Queue<int[]> queue) {
        var currentPos = queue.remove();
        var currentRow = currentPos[0];
        var currentCol = currentPos[1];

        for (int[] currentDir : directions) {
            int nextRow = currentRow + currentDir[0];
            int nextCol = currentCol + currentDir[1];
            if (nextRow < 0 || nextRow >= grid.length
                    || nextCol < 0 || nextCol >= grid[0].length)
                continue;
            if (grid[nextRow][nextCol] == '1') {
                queue.add(new int[]{nextRow, nextCol});
                grid[nextRow][nextCol] = '0';
            }
        }
    }
}
