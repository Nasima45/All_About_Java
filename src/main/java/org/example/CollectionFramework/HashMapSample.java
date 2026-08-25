package org.example.CollectionFramework;

import java.util.*;

public class HashMapSample {
    public static void main(String[] args) {
        Map<String,String> mapping = new HashMap<>();
        mapping.put("name1","kuhu");
        mapping.put("name1","kuhu");
        mapping.put("name2","kuhu");
        System.out.println(mapping);
        Map<String,String> table = new HashMap<>();
        table.put("name3","naj");
        table.putAll(mapping);
        System.out.println(table);
        table.remove("name1");
        System.out.println(table.size());
        table.putIfAbsent("namme4","paro");
        //return nulll if no key present
        System.out.println(table.get("name3"));
        System.out.println(table.getOrDefault("name3","not found"));
        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("paro"));
        table.replace("namme4","nasu");
        System.out.println(table);
        System.out.println(table.keySet());
        System.out.println(table.values());
        Set<Map.Entry<String,String>> entryset=table.entrySet();
        System.out.println(entryset);
        for(Map.Entry<String,String> entry: table.entrySet()){
            System.out.println("keys: "+ entry.getKey()+",values: "+ entry.getValue());
        }

    }
}
