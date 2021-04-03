package com.lzp.test.jdk8;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class Timejdk8 {

//https://blog.csdn.net/u011236357/article/details/78296293
    public static void main(String[] args) throws InterruptedException {
        Clock clock = Clock.systemDefaultZone();
/*        System.out.println(clock.getZone());
        System.out.println(clock.instant());
        
        System.out.println(System.currentTimeMillis()==clock.millis());
        Set set = ZoneId.getAvailableZoneIds();
        set.forEach(e-> System.out.print(e));
        System.out.println();
        set.forEach(System.out::print);
        System.out.println();
        Iterator iterator = set.iterator();
        iterator.forEachRemaining(System.out::print);

        Clock.system(ZoneId.of("Europe/Paris"));*/
/*        Clock cc1 = Clock.fixed(Instant.now(),ZoneId.of("Asia/Shanghai"));
        for (int i = 0; i < 3; i++) {
            System.out.println("cc1    "+cc1.instant());
            Thread.sleep(1000);
            System.out.println("loacl   "+LocalDateTime.now());
            System.out.println("date    "+new Date());
            System.out.println("INSTANT"+Date.from(Instant.now()));
            System.out.println("ins cc1"+Date.from(cc1.instant()));
        }*/


/*        Date date = Date.from(Instant.now());
        System.out.println("date111  "+date);
        System.out.println("local111  "+LocalDateTime.now());
        System.out.println("cc1"+cc1.instant());
        Thread.sleep(1000);
        System.out.println("date  "+date);
        System.out.println("local  "+LocalDateTime.now());*/
        //写数字 使用这个德国这个没问题 用china chinese 全是错 这两块不是很清楚
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);//withZone(ZoneId.of("Asian/Shanghai")) ;
        LocalTime localTime = LocalTime.parse("21:34",dateTimeFormatter);
        System.out.println(localTime);

        LocalDateTime aa = LocalDateTime.of(2019,Month.AUGUST,12,12,21,21);

        LocalDateTime ab = LocalDateTime.of(2018,Month.AUGUST,12,12,21,21);


        //计算两个时间间隔多少天 多少秒
        Duration between = Duration.between(aa,ab);
        System.out.println(between.toDays());
        System.out.println(between.toHours());

    }
}
