package nyc.c4q.lukesterlee;

import java.util.List;

public class Majority {

    public static boolean isMajority(List<Integer> list, int a) {
        int count = 0; // 1
        for (int number: list) { // 2n + 1
            if (number == a) // n
                count++; // n
        }
        if (count > list.size()/2) // 3
            return true;
        return false;
        // total running time : 4n + 5
        // time complexity : O(N)
    }

    public static void main(String[] args) {

    }
}
