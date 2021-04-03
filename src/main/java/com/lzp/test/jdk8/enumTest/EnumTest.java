package com.lzp.test.jdk8.enumTest;

import java.util.EnumMap;

public class EnumTest {
    public static void main(String[] args) {
        EnumMap map = new EnumMap(WeekEnum.class);
        {
            map.put(WeekEnum.MON,"星期1");
            map.put(WeekEnum.TUES,"星期2");

            map.put(WeekEnum.WED,"星期3");
        }
        WeekEnum weekEnum1 = WeekEnum.MON;
        WeekEnum weekEnum2 = WeekEnum.TUES;
        WeekEnum weekEnum3 = WeekEnum.WED;
        for (WeekEnum w : WeekEnum.values()){
            System.out.println(w.china);
        }
        for (WeekEnum w : WeekEnum.values()){
            System.out.println(w+"  "+map.get(w));
        }
    }
}
