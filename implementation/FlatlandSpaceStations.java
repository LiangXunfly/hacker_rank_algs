package implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/25.
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cities = in.nextInt();
        int stations = in.nextInt();
        if (cities <= 1) {
            System.out.println(0);
            return;
        }
        int[] stationLocations = new int[stations];
        for (int i = 0; i < stations; i++) {
            stationLocations[i] = in.nextInt();
        }
        Arrays.sort(stationLocations);
        int result = Math.max(stationLocations[0] - 0, cities - 1 - stationLocations[stations - 1]);
        for (int i = 1; i < stations; i++) {
            int distance = stationLocations[i] - stationLocations[i - 1];
            if (distance / 2 > result) {
                result = distance / 2;
            }
        }
        /*
        for (int i = 0; i < cities; i++) {
            int distance = 0;
            if (i <= stationLocations[0]) {
                distance = stationLocations[0] - i;
            } else if (i >= stationLocations[stations - 1]) {
                distance = i - stationLocations[stations - 1];
            } else {
                for (int j = 0; j < stations; j++) {
                    if (i >= stationLocations[j]) {
                        continue;
                    } else {
                        distance = Math.min(i - stationLocations[j - 1], stationLocations[j] - i);
                        break;
                    }
                }
            }
            if (distance > result) {
                result = distance;
            }
        }
        */
        System.out.println(result);
    }
}
