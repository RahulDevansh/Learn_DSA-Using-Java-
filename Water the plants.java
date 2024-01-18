// https://www.geeksforgeeks.org/problems/water-the-plants--170646/1
class pair implements Comparable<pair> {
    int first, second;

    pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compareTo(pair other) {
        return Integer.compare(this.first, other.first);
    }
}

class Solution {
    int min_sprinklers(int gallery[], int n) {
        ArrayList<pair> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (gallery[i] != -1) {
                l.add(new pair(i - gallery[i], i + gallery[i]));
            }
        }

        Collections.sort(l);

        int count = 0;
        int i = 0;
        int target = 0;

        while (target < n) {
            int maxEnd = target - 1; 

            while (i < l.size()) {
                if (l.get(i).first > target)
                    break;
                maxEnd = Math.max(maxEnd, l.get(i).second);
                i++;
            }

            if (maxEnd < target) {
                return -1;
            }

            count++;
            target = maxEnd + 1;
        }

        return count;
    }
}
