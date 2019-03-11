package com.example.demo;

public class OrderPair<K, V> implements Pair<K, V> {
    private K k;
    private V v;

    public OrderPair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }

}
