package com.mehrdad.falahati.algorithms.graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NetworkDelayTime {

    public static void main(String[] args) {
        NetworkDelayTime ndt = new NetworkDelayTime();
        System.out.println(ndt.networkDelayTimeFast(new int[][]{{1,2,1}, {2,1,3}}, 2, 2));
    }

    //Belman ford
    public int networkDelayTimeFast(int[][] times, int n, int k) {
        Map<Integer, Long> distances = new HashMap<>();

        for (int node = 1; node <= n; node++) {
            distances.put(node, (long) Integer.MAX_VALUE);
        }
        distances.replace(k, 0L);

        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (var time: times) {
                var source = time[0];
                var target = time[1];
                var weight = time[3];
                var newDistance = distances.get(source) + weight;
                if (newDistance < distances.get(target)) {
                    distances.replace(target, newDistance);
                    count++;
                }
            }
            if (count == 0) break;
        }
        long minimumTime = Collections.max(distances.values());
        return minimumTime >= Integer.MAX_VALUE ? -1: (int) minimumTime;
    }
}
