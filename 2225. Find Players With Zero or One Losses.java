// https://leetcode.com/problems/find-players-with-zero-or-one-losses/?envType=daily-question&envId=2024-01-15
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int[] n : matches)
        {
            hashMap.put(n[0] , hashMap.getOrDefault(n[0] , 0) + 0);
            hashMap.put(n[1] , hashMap.getOrDefault(n[1] , 0) + 1);
        }

        TreeSet<Integer> winner = new TreeSet<>();
        TreeSet<Integer> loser = new TreeSet<>();

        for (Map.Entry<Integer , Integer> map : hashMap.entrySet())
        {
            if (map.getValue() == 0) winner.add(map.getKey());
            else if (map.getValue() == 1) loser.add(map.getKey());
        }
            result.add(new ArrayList<>(winner));
            result.add(new ArrayList<>(loser));

        return result;
    }
}
