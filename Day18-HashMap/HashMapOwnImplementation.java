import java.util.*;

public class HashMapOwnImplementation {

    static class MyHashMap<K, V> {
        final int DEFAULT_CAPACITY = 4;
        final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;

            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];
            int di = searchInBucket(ll, key);

            if (di != -1) {
                ll.get(di).value = value;
            } else {
                ll.add(new Node(key, value));
                n++;
            }

            float lambda = (float) n / buckets.length;
            if (lambda > DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];
            int di = searchInBucket(ll, key);

            if (di != -1) {
                return ll.get(di).value;
            }
            return null;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];
            int di = searchInBucket(ll, key);

            if (di != -1) {
                Node node = ll.remove(di);
                n--;
                return node.value;
            }
            return null;
        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("India", 140);
        map.put("USA", 330);
        map.put("China", 1440);

        System.out.println(map.get("India"));
        System.out.println(map.remove("USA"));
        System.out.println(map.get("USA"));
        System.out.println(map.size());
    }
}
