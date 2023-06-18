package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> answ = new HashMap<>();
        sourceMap.forEach((key, value) ->{
            if (!answ.containsKey(value)){
                answ.put(value,key);
            }else if (answ.get(value)>key){
                answ.replace(value,key);
            }
        });


        return answ;
    }
}
