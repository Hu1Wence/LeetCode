import java.util.*;

public class Test {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new myComp(map));
        return list.subList(0, k);
    }

    class myComp implements Comparator<String> {
        HashMap<String, Integer> map = null;

        public myComp(HashMap<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            int count1 = map.get(o1);
            int count2 = map.get(o2);

            if (count1 == count2) {
                return o1.compareTo(o2);
            }

            return count1 - count2;
        }
    }
}
