package code2205;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/30
 */
public class LRUCache {
    private LinkedHashMap<Integer,Integer> cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity);
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        int res = cache.get(key);
        cache.remove(key);
        cache.put(key,res); //把节点重新放到链表末尾处
        return res;
    }

    public void put(int key, int value){
        if (cache.containsKey(key)) {
            cache.remove(key);
        }
        if (capacity==cache.size()){
            //cache已满，删除链表头位置
            Set<Integer> keySet = cache.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            cache.remove(iterator.next());
        }
        cache.put(key,value);//插入到链表末尾
    }
}
