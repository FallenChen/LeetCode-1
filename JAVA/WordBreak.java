public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s.isEmpty() || dict.isEmpty()) return false;
        int n = s.length();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        queue.add(0);
        visited.add(0);
        while (!queue.isEmpty()) {
            int curIndex = queue.poll();
            for (int i = curIndex + 1; i <= n; i++) {
                if (visited.contains(i)) continue;
                if (dict.contains(s.substring(curIndex, i))) {
                    if (i == n) return true;
                    queue.add(i);
                    visited.add(i);
                }
            }
        }
        return false;
    }
}