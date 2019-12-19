package com.zy.datacleaning;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static <Q,W> MapWrapper<Q,W> map(Q q, W w) {
        return new MapWrapper<Q, W>(q, w);
    }

    private static final class MapWrapper<Q,W> {
        private final HashMap<Q,W> map;
        public MapWrapper(Q q, W w) {
            map = new HashMap<Q, W>();
            map.put(q, w);
        }
        public MapWrapper<Q,W> map(Q q, W w) {
            map.put(q, w);
            return this;
        }
        public Map<Q,W> getMap() {
            return map;
        }
    }

    public static void main(String[] args) {
    	
        Map<String, Integer> map = Maps.map("one", 1).map("two", 2).map("three", 3).getMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}