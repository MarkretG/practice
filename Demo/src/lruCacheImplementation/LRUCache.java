package lruCacheImplementation;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private HashMap<Integer,Integer> map=new HashMap<>(10);
    private void set(int key,int value) {
        if (map.containsKey(key)) {
            map.put(key, -1);
        }
        else if (map.size() != 10)
        {
            map.put(key,value);
            return;
        }
        else if(map.size()==10){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int val = entry.getKey();
                if (val == -1) {
                    map.remove(entry.getKey());
                    break;
                }
            }
            map.put(key,value);
        }
    }
    public static void main(String[] args) {
        LRUCache cache=new LRUCache();
        cache.set(1,10);
        cache.set(2,20);
        cache.set(3,30);
        cache.set(1,40);
        cache.set(4,10);
        cache.set(5,20);
        cache.set(6,30);
        cache.set(7,40);
        cache.set(2,10);
        cache.set(3,20);
        cache.set(7,30);
        cache.set(7,40);
        cache.set(8,90);
        cache.set(23,90);
        cache.set(34,10);
        System.out.println(cache.map.size());
        System.out.println(cache.map);
        cache.set(12,9);
        System.out.println(cache.map.size());
        System.out.println(cache.map);
    }
}
