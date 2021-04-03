package com.lzp.test.jdk8.enumTest;

import java.util.EnumMap;

public enum WeekEnum {
    MON("你大爷的星期一"),TUES("你妹的星期二"),WED("你爹的星期三");
    String china;


    WeekEnum(String china) {
        this.china = china;
    }
}
