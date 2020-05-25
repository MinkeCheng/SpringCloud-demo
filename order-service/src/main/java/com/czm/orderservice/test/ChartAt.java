package com.czm.orderservice.test;

import java.util.HashMap;
import java.util.Map;

public class ChartAt {
    static String str = "youyouyouaa1111u你你你你你你";

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>(16);
        Character chart = null;
        for(int i = 0;i<str.length();i++){
            chart = str.charAt(i);
            if(map.containsKey(chart)){
                map.put(chart,map.get(chart)+1);
            }else {
                map.put(chart,0);
            }
        }
        int maxTmp = 0;
        Character key= ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
         if(entry.getValue()>maxTmp){
             maxTmp = entry.getValue();
             key = entry.getKey();
         }
        }
        System.out.println(key+" 出现："+maxTmp);

    }
}
